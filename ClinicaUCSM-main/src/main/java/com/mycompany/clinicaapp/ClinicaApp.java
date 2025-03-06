package com.mycompany.clinicaapp;
        
import com.mycompany.models.cita;
import com.mycompany.models.eodonto;
import com.mycompany.models.paciente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
 import java.sql.*;
 import java.util.Scanner;
import javax.swing.JOptionPane;
 
 public class ClinicaApp {

    private static Connection connection;
    
     public static void main(String[] args) {
        conectarBaseDeDatos();
    }
     
     public static void conectarBaseDeDatos() {
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/clinicadb", "postgres", "root");
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void registrarPaciente(paciente paciente) {
        conectarBaseDeDatos();
        String sql = "CALL sp_registrar_paciente(?, ?, ?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, paciente.getDocid());
            cstmt.setString(2, paciente.getName());
            cstmt.setString(3, paciente.getApaterno());
            cstmt.setString(4, paciente.getAmaterno());
            cstmt.setString(5, paciente.getEmail());
            cstmt.execute();
            System.out.println("Paciente registrado exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar paciente: " + e.getMessage());
        }
    }
    
    public static void registrarCita(cita cita) {
        conectarBaseDeDatos();
        String sql = "CALL sp_registrar_cita(?, ?, ?, ?, ?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, cita.getDocid());
            cstmt.setInt(2, cita.getCode());
            cstmt.setInt(3, cita.getDay());
            cstmt.setInt(4, cita.getMonth());
            cstmt.setInt(5, cita.getYear());
            cstmt.setString(6, String.valueOf(cita.getTurno()));
            cstmt.setString(7, cita.getMotivo());
            cstmt.execute();
            System.out.println("Cita registrada exitosamente.");
        } catch (SQLException e) {
            System.out.println("Error al registrar cita: " + e.getMessage());
        }
    }

    public static void mostrarPacientesYCantidadCitas(int docid) {
        String sql = "SELECT * FROM sp_mostrar_citas_paciente(?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, docid);
            try (ResultSet rs = pstmt.executeQuery()) {
                System.out.println("Citas del paciente con DNI " + docid + ":");
                while (rs.next()) {
                    int ncita = rs.getInt("ncita");
                    int dia = rs.getInt("dia");
                    int mes = rs.getInt("mes");
                    int anio = rs.getInt("anio");
                    String motivo = rs.getString("motivo");
                    System.out.println("Cita #" + ncita + ": " + dia + "/" + mes + "/" + anio + " - Motivo: " + motivo);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar citas del paciente: " + e.getMessage());
        }
    }
 
    public static void contarCitasOdontologo(Scanner scanner) {
        System.out.print("Ingrese el código del odontólogo: ");
        int code = scanner.nextInt();
        scanner.nextLine();

        String query = "SELECT fn_contar_citas_odontologo(?)";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, code);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int nrocitas = rs.getInt(1);
                    System.out.println("Número de citas del odontólogo con código " + code + ": " + nrocitas);
                } else {
                    System.out.println("No se encontraron citas para el odontólogo con código " + code);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al contar citas del odontólogo: " + e.getMessage());
        }
    }

 
    public static void mostrarCitasRegistradas() {
        String sql = "CALL contar_citas_registradas()";
        
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 
    public static void mostrarCitasOdontologo(Scanner scanner) {
        System.out.print("Ingrese el código del odontólogo (code): ");
        int code = scanner.nextInt();
        
        String sql = "CALL mostrar_citas_odontologo(?)";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, code);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
 
     public static void mostrarCitasTurnoEspecifico() {
        String sql = "CALL sp_mostrar_citas_por_turno(?, ?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 1); 
            cstmt.setInt(2, 5);
            cstmt.setInt(3, 10);
            cstmt.setInt(4, 2023);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Cita: " + rs.getInt("ncita") + 
                        ", Día: " + rs.getInt("day") +
                        ", Mes: " + rs.getInt("month") +
                        ", Año: " + rs.getInt("year") +
                        ", Motivo: " + rs.getString("motivo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

     }
 
     public static void mostrarEmpleadoPorteria() {
        String sql = "CALL sp_mostrar_empleado_porteria(?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 4);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("ID Lista: " + rs.getInt("id_lista") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Apellido: " + rs.getString("apaterno"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
 
     public static void mostrarCitasPosteriores() {
        String sql = "CALL sp_mostrar_citas_posteriores(?, ?, ?)";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            cstmt.setInt(1, 19);
            cstmt.setInt(2, 10);
            cstmt.setInt(3, 2023);
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Cita: " + rs.getInt("ncita") + 
                        ", Día: " + rs.getInt("day") +
                        ", Mes: " + rs.getInt("month") +
                        ", Año: " + rs.getInt("year") +
                        ", Motivo: " + rs.getString("motivo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
 
     public static void mostrarPacienteYEstudiante() {
        String sql = "CALL sp_mostrar_pacientes_y_odontologos()";
        try (CallableStatement cstmt = connection.prepareCall(sql)) {
            try (ResultSet rs = cstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println("Paciente: " + rs.getString("paciente") + 
                        ", Odontólogo: " + rs.getString("odontologo"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
     
     public static void registrarEstudiante(eodonto eodonto) {
            conectarBaseDeDatos();
            String sql = "CALL registrar_estudiante(?, ?, ?, ?, ?)";
            try (CallableStatement cstmt = connection.prepareCall(sql)) {
                cstmt.setInt(1, eodonto.getCode());
                cstmt.setString(2, eodonto.getName());
                cstmt.setString(3, eodonto.getApaterno());
                cstmt.setString(4, eodonto.getAmaterno());
                cstmt.setString(5, eodonto.getEmail());
                cstmt.execute();
                System.out.println("Estudiante registrado exitosamente.");
            } catch (SQLException e) {
                System.out.println("Error al registrar estudiante: " + e.getMessage());
        }
    }
    public static void eliminarEstudiante(eodonto eodonto) {
        conectarBaseDeDatos();
        String sql = "DELETE FROM eodonto WHERE code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            // Codigo
            pstmt.setInt(1, eodonto.getCode());

            // Ejecuta
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Estudiante eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un estudiante con el código especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar estudiante: " + e.getMessage());
        }
    }
    public static void updateEstudiante(eodonto estudiante) {
        conectarBaseDeDatos();
        String sql = "UPDATE eodonto SET email = ? WHERE code = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            // Parametros
            pstmt.setString(1, estudiante.getEmail());
            pstmt.setInt(2, estudiante.getCode());  

            // Ejecucion
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Estudiante actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un estudiante con el código especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar al estudiante: " + e.getMessage());
        }
    }
    public String obtenerCitasPorFecha(String fecha) {
        StringBuilder resultado = new StringBuilder();
        conectarBaseDeDatos();

        // Extraer el día, mes y año de la fecha
        String[] fechaPartes = fecha.split("-"); // Fecha en formato "yyyy-MM-dd"
        int year = Integer.parseInt(fechaPartes[0]);
        int month = Integer.parseInt(fechaPartes[1]);
        int day = Integer.parseInt(fechaPartes[2]);

        // SQL con INNER JOIN entre listc y cita
        String sql = "SELECT c.ncita, c.docid, c.motivo, l.day, l.month, l.year " +
                     "FROM cita c " +
                     "INNER JOIN listc l ON c.idlist = l.id " + // Relación entre cita y listc
                     "WHERE l.day = ? AND l.month = ? AND l.year = ?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // Establecer los valores de los parámetros en la consulta
            pstmt.setInt(1, day);   // Día
            pstmt.setInt(2, month); // Mes
            pstmt.setInt(3, year);  // Año

            // Ejecutar la consulta
            ResultSet rs = pstmt.executeQuery();

            // Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("ncita");
                String paciente = rs.getString("docid"); // Información del paciente
                String hora = rs.getString("motivo");         // Hora de la cita
                int day1 = rs.getInt("day");                // Día de la cita (desde listc)
                int month1 = rs.getInt("month");            // Mes de la cita (desde listc)
                int year1 = rs.getInt("year");              // Año de la cita (desde listc)
                resultado.append(String.format("ID: %d, Paciente: %s, Hora: %s, Fecha: %d-%d-%d\n", 
                        id, paciente, hora, day1, month1, year1));
            }

            // Si no hay resultados
            if (resultado.length() == 0) {
                resultado.append("No hay citas para la fecha seleccionada.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error al consultar las citas: " + e.getMessage();
        }

        return resultado.toString();
    }


    public void guardarResultadosEnArchivo(String resultado) {
        try {
            
            File file = new File("citas.txt");

            // Verifica si el archivo existe, si no, lo crea
            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                if (!fileCreated) {
                    throw new Exception("No se pudo crear el archivo.");
                }
            }

            // Escribir en el archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write("Fecha del envío del reporte: " + new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date()) + "\n");
                writer.write(resultado);
                writer.write("\n\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar los resultados en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 }
 