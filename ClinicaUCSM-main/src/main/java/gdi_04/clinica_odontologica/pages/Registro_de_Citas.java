package gdi_04.clinica_odontologica.pages;

import com.mycompany.clinicaapp.ClinicaApp;
import com.mycompany.models.cita;

public class Registro_de_Citas extends javax.swing.JPanel {

    private void InitStyles() {
        
    }
    
    public Registro_de_Citas() {
        initComponents();
        InitStyles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JPanel();
        MotivoInput = new javax.swing.JTextField();
        IdPacienteInput = new javax.swing.JTextField();
        PacienteLabel = new javax.swing.JLabel();
        MotivoLabel = new javax.swing.JLabel();
        anioInput = new javax.swing.JTextField();
        FechaLabel = new javax.swing.JLabel();
        TurnoLabel = new javax.swing.JLabel();
        GuardarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        TurnoInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        mesInput1 = new javax.swing.JTextField();
        diaInput = new javax.swing.JTextField();
        TratanteLabel = new javax.swing.JLabel();
        TratanteInput = new javax.swing.JTextField();

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

        MotivoInput.setPreferredSize(new java.awt.Dimension(325, 35));
        MotivoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotivoInputActionPerformed(evt);
            }
        });

        IdPacienteInput.setPreferredSize(new java.awt.Dimension(357, 35));
        IdPacienteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPacienteInputActionPerformed(evt);
            }
        });

        PacienteLabel.setText("ID. del Paciente");

        MotivoLabel.setText("Motivo de la cita");

        anioInput.setPreferredSize(new java.awt.Dimension(325, 35));
        anioInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioInputActionPerformed(evt);
            }
        });

        FechaLabel.setText("Fecha (aaaa/mm/dd)");

        TurnoLabel.setText("Turno");

        GuardarButton.setText("Guardar");
        GuardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        Title.setText("Registro de Citas");

        TurnoInput.setPreferredSize(new java.awt.Dimension(348, 35));
        TurnoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoInputActionPerformed(evt);
            }
        });

        mesInput1.setPreferredSize(new java.awt.Dimension(325, 35));
        mesInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesInput1ActionPerformed(evt);
            }
        });

        diaInput.setPreferredSize(new java.awt.Dimension(325, 35));
        diaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaInputActionPerformed(evt);
            }
        });

        TratanteLabel.setText("Tratante");

        TratanteInput.setPreferredSize(new java.awt.Dimension(357, 35));
        TratanteInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TratanteInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(GuardarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(TratanteLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TratanteInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdPacienteInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MotivoInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PacienteLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MotivoLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(115, 115, 115)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TurnoInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaLabel)
                                    .addComponent(TurnoLabel)
                                    .addGroup(BackgroundLayout.createSequentialGroup()
                                        .addComponent(anioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mesInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(diaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(78, 78, 78))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacienteLabel)
                    .addComponent(FechaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdPacienteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotivoLabel)
                    .addComponent(TurnoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotivoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TurnoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TratanteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TratanteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarButton)
                    .addComponent(GuardarButton))
                .addGap(214, 214, 214))
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

    private void MotivoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotivoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotivoInputActionPerformed

    private void IdPacienteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPacienteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdPacienteInputActionPerformed

    private void anioInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioInputActionPerformed

    private void TurnoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnoInputActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        cita nuevaCita = new cita();
        try {
            // Validación de entrada
            nuevaCita.setDocid(Integer.parseInt(IdPacienteInput.getText()));
            nuevaCita.setCode(Integer.parseInt(TratanteInput.getText()));
            nuevaCita.setDay(Integer.parseInt(diaInput.getText()));
            nuevaCita.setMonth(Integer.parseInt(mesInput1.getText()));
            nuevaCita.setYear(Integer.parseInt(anioInput.getText()));
            nuevaCita.setTurno(TurnoInput.getText().charAt(0));
            nuevaCita.setMotivo(MotivoInput.getText());

            // Validar que todos los campos estén llenos
            if (nuevaCita.getMotivo().isEmpty() || TurnoInput.getText().isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            // Llamar al método para registrar la cita
            ClinicaApp dao = new ClinicaApp();
            dao.registrarCita(nuevaCita);

            javax.swing.JOptionPane.showMessageDialog(this, "Cita registrada exitosamente.");
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingresa valores válidos en los campos numéricos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar cita: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void mesInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesInput1ActionPerformed

    private void diaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaInputActionPerformed

    private void TratanteInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TratanteInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TratanteInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel FechaLabel;
    private javax.swing.JButton GuardarButton;
    private javax.swing.JTextField IdPacienteInput;
    private javax.swing.JTextField MotivoInput;
    private javax.swing.JLabel MotivoLabel;
    private javax.swing.JLabel PacienteLabel;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField TratanteInput;
    private javax.swing.JLabel TratanteLabel;
    private javax.swing.JTextField TurnoInput;
    private javax.swing.JLabel TurnoLabel;
    private javax.swing.JTextField anioInput;
    private javax.swing.JTextField diaInput;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mesInput1;
    // End of variables declaration//GEN-END:variables
}
