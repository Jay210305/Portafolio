package gdi_04.clinica_odontologica.pages;

import com.mycompany.clinicaapp.ClinicaApp;
import com.mycompany.models.eodonto;
import javax.swing.JOptionPane;

public class Gestion_de_estudiantes extends javax.swing.JPanel {

    private void InitStyles() {
        
    }
    
    public Gestion_de_estudiantes() {
        initComponents();
        InitStyles();
    }
    private void CrearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                              

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JPanel();
        APaternoInsert = new javax.swing.JTextField();
        UpdateValor = new javax.swing.JTextField();
        NombresLabel = new javax.swing.JLabel();
        APaternoLabel = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AmaternoLabel = new javax.swing.JLabel();
        CodigoInsert = new javax.swing.JTextField();
        AmaternoInsert = new javax.swing.JTextField();
        CodigoLabel = new javax.swing.JLabel();
        EmailInsert = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NombresLabel1 = new javax.swing.JLabel();
        NombreInsert = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        crear = new javax.swing.JToggleButton();
        UpdateCombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NumeroInsert = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UpdateCodigo = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EliminarCodigo = new javax.swing.JTextField();
        eliminarButton = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();

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

        Background.setPreferredSize(new java.awt.Dimension(960, 620));

        APaternoInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInsertActionPerformed(evt);
            }
        });

        UpdateValor.setPreferredSize(new java.awt.Dimension(325, 35));
        UpdateValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateValorActionPerformed(evt);
            }
        });

        NombresLabel.setText("Nombre(s)");

        APaternoLabel.setText("Apellido Paterno");

        Title.setText("Gestión de Estudiantes");

        jLabel1.setText("Nuevo Estudiante");

        AmaternoLabel.setText("Apellido Materno");

        CodigoInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        CodigoInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoInsertActionPerformed(evt);
            }
        });

        AmaternoInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        AmaternoInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmaternoInsertActionPerformed(evt);
            }
        });

        CodigoLabel.setText("Codigo estudiante");

        EmailInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        EmailInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInsertActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email");

        NombresLabel1.setText("Número de telefono");

        NombreInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        NombreInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreInsertActionPerformed(evt);
            }
        });

        jLabel2.setText("Editar info. Estudiante");

        jPanel1.setBackground(new java.awt.Color(29, 90, 126));
        jPanel1.setPreferredSize(new java.awt.Dimension(1, 221));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        UpdateCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Email" }));
        UpdateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateComboActionPerformed(evt);
            }
        });

        jLabel3.setText("Info. a modificar");

        NumeroInsert.setPreferredSize(new java.awt.Dimension(325, 35));
        NumeroInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroInsertActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese el codigo del estudiante");

        UpdateCodigo.setPreferredSize(new java.awt.Dimension(325, 35));
        UpdateCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCodigoActionPerformed(evt);
            }
        });

        UpdateButton.setText("Aceptar");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Eliminar Estudiante");

        jLabel6.setText("Ingrese el codigo del estudiante");

        EliminarCodigo.setPreferredSize(new java.awt.Dimension(325, 35));
        EliminarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarCodigoActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("¿Dese eliminar al estudiante?");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(NumeroInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(crear))
                    .addComponent(NombresLabel1)
                    .addComponent(jLabel1)
                    .addComponent(Title)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(NombresLabel)
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(NombreInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(APaternoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AmaternoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(APaternoLabel)
                                .addGap(85, 85, 85)
                                .addComponent(AmaternoLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CodigoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel)
                            .addComponent(EmailInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UpdateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(267, 267, 267))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(UpdateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UpdateValor, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(UpdateButton))
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(eliminarButton)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresLabel)
                    .addComponent(APaternoLabel)
                    .addComponent(AmaternoLabel)
                    .addComponent(CodigoLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APaternoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmaternoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombresLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UpdateCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(UpdateButton))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarButton)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void APaternoInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInsertActionPerformed

    private void UpdateValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateValorActionPerformed

    private void CodigoInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoInsertActionPerformed

    private void AmaternoInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmaternoInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmaternoInsertActionPerformed

    private void EmailInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInsertActionPerformed

    private void NombreInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreInsertActionPerformed

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        // Crear un objeto eodonto
        eodonto estudiante = new eodonto();

        // Validar y asignar los datos ingresados en la UI
        try {
            estudiante.setCode(Integer.parseInt(CodigoInsert.getText()));
            estudiante.setName(NombreInsert.getText());
            estudiante.setApaterno(APaternoInsert.getText());
            estudiante.setAmaterno(AmaternoInsert.getText());
            estudiante.setEmail(EmailInsert.getText());

            // Validaciones adicionales para los campos
            if (estudiante.getName().isEmpty() || estudiante.getApaterno().isEmpty() || 
                estudiante.getAmaterno().isEmpty() || estudiante.getEmail().isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            // Llamar al método registrarEstudiante
            ClinicaApp dao = new ClinicaApp(); // Reutilizamos la lógica desde esta clase
            dao.registrarEstudiante(estudiante);

            // Mostrar un mensaje de éxito al usuario
            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante registrado exitosamente.");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El código debe ser un número válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar estudiante: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_crearActionPerformed

    private void NumeroInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroInsertActionPerformed

    private void UpdateCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateCodigoActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        eodonto estudiante = new eodonto();
        try{
            estudiante.setCode(Integer.parseInt(UpdateCodigo.getText()));
            estudiante.setEmail(UpdateValor.getText());
            if (UpdateCodigo.getText().isEmpty() || estudiante.getEmail().isEmpty()) {
                throw new IllegalArgumentException("El código es obligatorio y debe ser un número y el email a cambiar tambien");
            }
            ClinicaApp dao = new ClinicaApp(); // Reutilizamos la lógica desde esta clase
            dao.updateEstudiante(estudiante);
            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante actualizado exitosamente.");

        }
         catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar al estudiante: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void EliminarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarCodigoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_EliminarCodigoActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
        eodonto estudiante = new eodonto();
        try{
            estudiante.setCode(Integer.parseInt(EliminarCodigo.getText()));
            if (EliminarCodigo.getText().isEmpty()) {
                throw new IllegalArgumentException("El código es obligatorio y debe ser un número.");
            }
            ClinicaApp dao = new ClinicaApp(); // Reutilizamos la lógica desde esta clase
            dao.eliminarEstudiante(estudiante);

            // Mostrar un mensaje de éxito al usuario
            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante eliminado exitosamente.");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al elimnar al estudiante: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void UpdateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateComboActionPerformed
    private javax.swing.JButton crearButton;
    private javax.swing.JButton aceptarButton;
    private javax.swing.JTextField nombresTextField;
    private javax.swing.JTextField apaternoTextField;
    private javax.swing.JTextField amaternoTextField;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField telefonoTextField;
    private javax.swing.JTextField codigoActualizarTextField;
    private javax.swing.JComboBox<String> columnaComboBox;
    private javax.swing.JTextField nuevoValorTextField;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APaternoInsert;
    private javax.swing.JLabel APaternoLabel;
    private javax.swing.JTextField AmaternoInsert;
    private javax.swing.JLabel AmaternoLabel;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField CodigoInsert;
    private javax.swing.JLabel CodigoLabel;
    private javax.swing.JTextField EliminarCodigo;
    private javax.swing.JTextField EmailInsert;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField NombreInsert;
    private javax.swing.JLabel NombresLabel;
    private javax.swing.JLabel NombresLabel1;
    private javax.swing.JTextField NumeroInsert;
    private javax.swing.JLabel Title;
    private javax.swing.JToggleButton UpdateButton;
    private javax.swing.JTextField UpdateCodigo;
    private javax.swing.JComboBox<String> UpdateCombo;
    private javax.swing.JTextField UpdateValor;
    private javax.swing.JToggleButton crear;
    private javax.swing.JToggleButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
