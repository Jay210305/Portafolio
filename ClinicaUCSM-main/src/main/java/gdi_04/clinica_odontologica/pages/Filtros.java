package gdi_04.clinica_odontologica.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Filtros extends javax.swing.JPanel {

    private void InitStyles() {

    }

    public Filtros() {
        initComponents();
        buttonGroup1.add(estudiantes_con_mas_de_15_citas);
        buttonGroup1.add(estudiantes_con_citas_en_el_ano_actual);
        buttonGroup1.add(pacientes_con_mas_de_un_contacto);
        buttonGroup1.add(estudiantes_sin_citas);
        buttonGroup1.add(estudiantes_con_mas_de_un_contacto);
        buttonGroup1.add(estudiantes_con_citas_en_una_fecha_especifica);
        buttonGroup1.add(pacientes_con_citas_en_el_ultimo_mes);
        buttonGroup1.add(estudiantes_con_citas_en_la_ultima_semana);
        buttonGroup1.add(pacientes_con_citas_especificas_por_tipo);
        buttonGroup1.add(estudiantes_con_citas_en_un_rango_de_fechas);
        InitStyles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Background = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        ResultadoConsulta = new javax.swing.JLabel();
        BuscarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        estudiantes_con_mas_de_15_citas = new javax.swing.JRadioButton();
        estudiantes_con_citas_en_el_ano_actual = new javax.swing.JRadioButton();
        pacientes_con_mas_de_un_contacto = new javax.swing.JRadioButton();
        estudiantes_sin_citas = new javax.swing.JRadioButton();
        estudiantes_con_mas_de_un_contacto = new javax.swing.JRadioButton();
        estudiantes_con_citas_en_una_fecha_especifica = new javax.swing.JRadioButton();
        pacientes_con_citas_en_el_ultimo_mes = new javax.swing.JRadioButton();
        estudiantes_con_citas_en_la_ultima_semana = new javax.swing.JRadioButton();
        pacientes_con_citas_especificas_por_tipo = new javax.swing.JRadioButton();
        estudiantes_con_citas_en_un_rango_de_fechas = new javax.swing.JRadioButton();
        ano_fecha_especifica = new javax.swing.JTextField();
        mes_fecha_especifica = new javax.swing.JTextField();
        dia_fecha_especifica = new javax.swing.JTextField();
        tipo_cita = new javax.swing.JTextField();
        ano_rango_fechas_desde = new javax.swing.JTextField();
        mes_rango_fechas_desde = new javax.swing.JTextField();
        dia_rango_fechas_desde = new javax.swing.JTextField();
        desde_label = new javax.swing.JLabel();
        hasta_label = new javax.swing.JLabel();
        ano_rango_fechas_hasta = new javax.swing.JTextField();
        mes_rango_fechas_hasta = new javax.swing.JTextField();
        dia_rango_fechas_hasta = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(960, 620));

        Background.setPreferredSize(new java.awt.Dimension(960, 610));

        Title.setText("Filtros");

        ScrollPane.setViewportView(ResultadoConsulta);

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        estudiantes_con_mas_de_15_citas.setText("Estudiantes con más de 15 citas");

        estudiantes_con_citas_en_el_ano_actual.setText("Estudiantes con citas en el año actual");

        pacientes_con_mas_de_un_contacto.setText("Pacientes con más de un contacto");

        estudiantes_sin_citas.setText("Estudiantes sin citas");

        estudiantes_con_mas_de_un_contacto.setText("Estudiantes con más de un contacto");

        estudiantes_con_citas_en_una_fecha_especifica.setText("Estudiantes con citas en una fecha específica");

        pacientes_con_citas_en_el_ultimo_mes.setText("Pacientes con citas en el último mes");

        estudiantes_con_citas_en_la_ultima_semana.setText("Estudiantes con citas en la última semana");

        pacientes_con_citas_especificas_por_tipo.setText("Pacientes con citas específicas por tipo");

        estudiantes_con_citas_en_un_rango_de_fechas.setText("Estudiantes con citas en un rango de fechas");

        ano_fecha_especifica.setText("aaaa");
        ano_fecha_especifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano_fecha_especificaActionPerformed(evt);
            }
        });

        mes_fecha_especifica.setText("mm");

        dia_fecha_especifica.setText("dd");
        dia_fecha_especifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_fecha_especificaActionPerformed(evt);
            }
        });

        ano_rango_fechas_desde.setText("aaaa");
        ano_rango_fechas_desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano_rango_fechas_desdeActionPerformed(evt);
            }
        });

        mes_rango_fechas_desde.setText("mm");
        mes_rango_fechas_desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes_rango_fechas_desdeActionPerformed(evt);
            }
        });

        dia_rango_fechas_desde.setText("dd");
        dia_rango_fechas_desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_rango_fechas_desdeActionPerformed(evt);
            }
        });

        desde_label.setText("Desde");

        hasta_label.setText("Hasta");

        ano_rango_fechas_hasta.setText("aaaa");
        ano_rango_fechas_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ano_rango_fechas_hastaActionPerformed(evt);
            }
        });

        mes_rango_fechas_hasta.setText("mm");
        mes_rango_fechas_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mes_rango_fechas_hastaActionPerformed(evt);
            }
        });

        dia_rango_fechas_hasta.setText("dd");
        dia_rango_fechas_hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_rango_fechas_hastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarButton)
                    .addComponent(estudiantes_con_mas_de_15_citas)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estudiantes_con_citas_en_el_ano_actual)
                    .addComponent(pacientes_con_mas_de_un_contacto)
                    .addComponent(estudiantes_sin_citas)
                    .addComponent(estudiantes_con_mas_de_un_contacto)
                    .addComponent(pacientes_con_citas_en_el_ultimo_mes)
                    .addComponent(estudiantes_con_citas_en_la_ultima_semana)
                    .addComponent(pacientes_con_citas_especificas_por_tipo)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(ano_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tipo_cita, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(estudiantes_con_citas_en_un_rango_de_fechas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                            .addComponent(desde_label)
                            .addGap(18, 18, 18)
                            .addComponent(ano_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mes_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dia_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(estudiantes_con_citas_en_una_fecha_especifica))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(hasta_label)
                        .addGap(18, 18, 18)
                        .addComponent(ano_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Title))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_mas_de_15_citas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_citas_en_el_ano_actual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientes_con_mas_de_un_contacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_sin_citas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_mas_de_un_contacto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_citas_en_una_fecha_especifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ano_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia_fecha_especifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientes_con_citas_en_el_ultimo_mes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_citas_en_la_ultima_semana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientes_con_citas_especificas_por_tipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipo_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudiantes_con_citas_en_un_rango_de_fechas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ano_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia_rango_fechas_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desde_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasta_label)
                    .addComponent(ano_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia_rango_fechas_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BuscarButton)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        String query = "";
        boolean requiereParametro = false;

        // Identificar cuál filtro fue seleccionado
        if (estudiantes_con_mas_de_15_citas.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno, COUNT(c.ncita) AS total_citas
            FROM eodonto e
            INNER JOIN cita c ON e.code = c.code
            GROUP BY e.name, e.apaterno, e.amaterno
            HAVING COUNT(c.ncita) > 15
        """;
        } else if (estudiantes_con_citas_en_el_ano_actual.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno
            FROM eodonto e
            INNER JOIN cita c ON e.code = c.code
            WHERE c.year = 2024
        """;
        } else if (pacientes_con_mas_de_un_contacto.isSelected()) {
            query = """
            SELECT p.name, p.apaterno, p.amaterno, COUNT(cp.nro) AS total_contactos
            FROM paciente p
            INNER JOIN nconpa cp ON p.docid = cp.docid
            GROUP BY p.name, p.apaterno, p.amaterno
            HAVING COUNT(cp.nro) > 1
        """;
        } else if (estudiantes_sin_citas.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno
            FROM eodonto e
            LEFT JOIN cita c ON e.code = c.code
            WHERE c.ncita IS NULL
        """;
        } else if (estudiantes_con_mas_de_un_contacto.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno, COUNT(ce.nro) AS total_contactos
            FROM eodonto e
            INNER JOIN ncones ce ON e.code = ce.code
            GROUP BY e.name, e.apaterno, e.amaterno
            HAVING COUNT(ce.nro) > 1
        """;
        } else if (pacientes_con_citas_especificas_por_tipo.isSelected()) {
            query = """
            SELECT p.name, p.apaterno, p.amaterno
            FROM paciente p
            INNER JOIN cita c ON p.docid = c.docid
            WHERE c.motivo = ?
        """;
            requiereParametro = true;
        } else if (pacientes_con_citas_en_el_ultimo_mes.isSelected()) {
            LocalDate fechaActual = LocalDate.now();
            int mesActual = fechaActual.getMonthValue();
            query = """
            SELECT p.name, p.apaterno, p.amaterno
            FROM paciente p
            INNER JOIN cita c ON p.docid = c.docid
            WHERE c.month = ?
        """;
            requiereParametro = true;
        } else if (estudiantes_con_citas_en_la_ultima_semana.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno
            FROM eodonto e
            INNER JOIN cita c ON e.code = c.code
            WHERE (c.year, c.month, c.day) BETWEEN 
                  (EXTRACT(YEAR FROM CURRENT_DATE - INTERVAL '7 DAYS'),
                   EXTRACT(MONTH FROM CURRENT_DATE - INTERVAL '7 DAYS'),
                   EXTRACT(DAY FROM CURRENT_DATE - INTERVAL '7 DAYS'))
                  AND (EXTRACT(YEAR FROM CURRENT_DATE),
                       EXTRACT(MONTH FROM CURRENT_DATE),
                       EXTRACT(DAY FROM CURRENT_DATE))
        """;
        } else if (pacientes_con_citas_especificas_por_tipo.isSelected()) {
            query = """
            SELECT p.name, p.apaterno, p.amaterno
            FROM paciente p
            INNER JOIN cita c ON p.docid = c.docid
            WHERE c.motivo = 'Urgente'
        """;
        } else if (estudiantes_con_citas_en_un_rango_de_fechas.isSelected()) {
            query = """
            SELECT e.name, e.apaterno, e.amaterno
            FROM eodonto e
            INNER JOIN cita c ON e.code = c.code
            WHERE (c.year, c.month, c.day) BETWEEN (?, ?, ?) AND (?, ?, ?)
            """;
            requiereParametro = true;
        } else if (estudiantes_con_citas_en_una_fecha_especifica.isSelected()) {
            query = """
        SELECT e.name, e.apaterno, e.amaterno
        FROM eodonto e
        INNER JOIN cita c ON e.code = c.code
        WHERE c.year = ? AND c.month = ? AND c.day = ?
        """;
            requiereParametro = true;
        }

        // Si no hay un filtro seleccionado, mostrar mensaje
        if (query.isEmpty()) {
            ResultadoConsulta.setText("Por favor, selecciona un filtro.");
            return;
        }

        // Obtener valores de TextBox si son necesarios
        String tipoCita = tipo_cita.getText().trim();
        String anoEspecifico = ano_fecha_especifica.getText().trim();
        String mesEspecifico = mes_fecha_especifica.getText().trim();
        String diaEspecifico = dia_fecha_especifica.getText().trim();

        String anoDesde = ano_rango_fechas_desde.getText().trim();
        String mesDesde = mes_rango_fechas_desde.getText().trim();
        String diaDesde = dia_rango_fechas_desde.getText().trim();

        String anoHasta = ano_rango_fechas_hasta.getText().trim();
        String mesHasta = mes_rango_fechas_hasta.getText().trim();
        String diaHasta = dia_rango_fechas_hasta.getText().trim();

        // Ejecutar la consulta seleccionada
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clinicadb", "postgres", "root"); PreparedStatement stmt = conn.prepareStatement(query)) {

            if (requiereParametro) {
                LocalDate fechaActual = LocalDate.now();
                stmt.setInt(1, fechaActual.getMonthValue());

                if (pacientes_con_citas_especificas_por_tipo.isSelected()) {
                    stmt.setString(1, tipoCita);
                } else if (estudiantes_con_citas_en_una_fecha_especifica.isSelected()) {
                    stmt.setInt(1, Integer.parseInt(anoEspecifico));
                    stmt.setInt(2, Integer.parseInt(mesEspecifico));
                    stmt.setInt(3, Integer.parseInt(diaEspecifico));
                    System.out.print(anoEspecifico + mesEspecifico + diaEspecifico);
                } else if (estudiantes_con_citas_en_un_rango_de_fechas.isSelected()) {
                    stmt.setInt(1, Integer.parseInt(anoDesde));
                    stmt.setInt(2, Integer.parseInt(mesDesde));
                    stmt.setInt(3, Integer.parseInt(diaDesde));
                    stmt.setInt(4, Integer.parseInt(anoHasta));
                    stmt.setInt(5, Integer.parseInt(mesHasta));
                    stmt.setInt(6, Integer.parseInt(diaHasta));
                }
            }

            try (ResultSet rs = stmt.executeQuery()) {
                StringBuilder resultadoHTML = new StringBuilder("<html><body>");
                while (rs.next()) {
                    String name = rs.getString("name");
                    String apaterno = rs.getString("apaterno");
                    String amaterno = rs.getString("amaterno");
                    resultadoHTML.append(name).append(" ").append(apaterno).append(" ").append(amaterno).append("<br>");
                }
                resultadoHTML.append("</body></html>");
                ResultadoConsulta.setText(resultadoHTML.toString());
            }
        } catch (SQLException e) {
            ResultadoConsulta.setText("Error en la consulta: " + e.getMessage());
        }
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void ano_fecha_especificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano_fecha_especificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano_fecha_especificaActionPerformed

    private void dia_fecha_especificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_fecha_especificaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia_fecha_especificaActionPerformed

    private void ano_rango_fechas_desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano_rango_fechas_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano_rango_fechas_desdeActionPerformed

    private void mes_rango_fechas_desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes_rango_fechas_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mes_rango_fechas_desdeActionPerformed

    private void dia_rango_fechas_desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_rango_fechas_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia_rango_fechas_desdeActionPerformed

    private void ano_rango_fechas_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ano_rango_fechas_hastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ano_rango_fechas_hastaActionPerformed

    private void mes_rango_fechas_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mes_rango_fechas_hastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mes_rango_fechas_hastaActionPerformed

    private void dia_rango_fechas_hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_rango_fechas_hastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia_rango_fechas_hastaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BuscarButton;
    private javax.swing.JLabel ResultadoConsulta;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField ano_fecha_especifica;
    private javax.swing.JTextField ano_rango_fechas_desde;
    private javax.swing.JTextField ano_rango_fechas_hasta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel desde_label;
    private javax.swing.JTextField dia_fecha_especifica;
    private javax.swing.JTextField dia_rango_fechas_desde;
    private javax.swing.JTextField dia_rango_fechas_hasta;
    private javax.swing.JRadioButton estudiantes_con_citas_en_el_ano_actual;
    private javax.swing.JRadioButton estudiantes_con_citas_en_la_ultima_semana;
    private javax.swing.JRadioButton estudiantes_con_citas_en_un_rango_de_fechas;
    private javax.swing.JRadioButton estudiantes_con_citas_en_una_fecha_especifica;
    private javax.swing.JRadioButton estudiantes_con_mas_de_15_citas;
    private javax.swing.JRadioButton estudiantes_con_mas_de_un_contacto;
    private javax.swing.JRadioButton estudiantes_sin_citas;
    private javax.swing.JLabel hasta_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mes_fecha_especifica;
    private javax.swing.JTextField mes_rango_fechas_desde;
    private javax.swing.JTextField mes_rango_fechas_hasta;
    private javax.swing.JRadioButton pacientes_con_citas_en_el_ultimo_mes;
    private javax.swing.JRadioButton pacientes_con_citas_especificas_por_tipo;
    private javax.swing.JRadioButton pacientes_con_mas_de_un_contacto;
    private javax.swing.JTextField tipo_cita;
    // End of variables declaration//GEN-END:variables
}
