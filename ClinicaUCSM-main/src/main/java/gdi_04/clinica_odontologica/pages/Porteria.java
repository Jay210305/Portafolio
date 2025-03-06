package gdi_04.clinica_odontologica.pages;

import com.mycompany.clinicaapp.ClinicaApp;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Porteria extends JFrame {
    private JDateChooser dateChooser;
    private JButton consultarButton;

    public Porteria() {
        setTitle("Portería");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(50, 50, 200, 30);
        add(dateChooser);

        consultarButton = new JButton("Consultar");
        consultarButton.setBounds(90, 100, 120, 30);
        add(consultarButton);

        consultarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarCitas();
            }
        });

        setVisible(true);
    }

    private void consultarCitas() {
        try {
            // Obtiene fecha
            Date selectedDate = dateChooser.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida.");
                return;
            }

            // Convierte la fecha (YYYY-MM-DD)
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(selectedDate);

            // clinicaapp
            ClinicaApp clinicaApp = new ClinicaApp();
            String resultado = clinicaApp.obtenerCitasPorFecha(formattedDate);

            // Resultado
            JOptionPane.showMessageDialog(this, resultado, "Resultado de la consulta", JOptionPane.INFORMATION_MESSAGE);

            // Guardar los resultados en un archivo
            guardarResultadosEnArchivo(resultado);

            // Mostrar mensaje de confirmación
            JOptionPane.showMessageDialog(this, "Los resultados se han enviado al portero.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al consultar citas: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarResultadosEnArchivo(String resultado) {
        try {

            File file = new File("citas.txt");
            if (!file.exists()) {
                file.createNewFile(); // Si el archivo no existe, lo crea
            }

            // Escribir en el archivo
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write("Fecha del envío del reporte: " + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + "\n");
                writer.write(resultado);
                writer.write("\n\n");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los resultados en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
