package gdi_04.clinica_odontologica.pages;

import com.mycompany.clinicaapp.ClinicaApp;
import com.mycompany.models.paciente;

public class Registro_de_Pacientes extends javax.swing.JPanel {

    private void InitStyles() {
        
    }
    
    public Registro_de_Pacientes() {
        initComponents();
        InitStyles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Background = new javax.swing.JPanel();
        APaternoInput = new javax.swing.JTextField();
        NombresInput = new javax.swing.JTextField();
        NombresLabel = new javax.swing.JLabel();
        APaternoLabel = new javax.swing.JLabel();
        EmailInput = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        DocIdLabel = new javax.swing.JLabel();
        GuardarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        DocIdLabelInput = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        ConfrimacionInsertLabel = new javax.swing.JLabel();
        AMaternoLabel = new javax.swing.JLabel();
        AMaternoInput = new javax.swing.JTextField();
        TelefonoLabel = new javax.swing.JLabel();
        TelefonoLabelInput = new javax.swing.JTextField();

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

        APaternoInput.setPreferredSize(new java.awt.Dimension(325, 35));
        APaternoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APaternoInputActionPerformed(evt);
            }
        });

        NombresInput.setPreferredSize(new java.awt.Dimension(325, 35));
        NombresInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresInputActionPerformed(evt);
            }
        });

        NombresLabel.setText("Nombre(s)");

        APaternoLabel.setText("Apellido Paterno");

        EmailInput.setPreferredSize(new java.awt.Dimension(325, 35));
        EmailInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailInputActionPerformed(evt);
            }
        });

        EmailLabel.setText("Email");

        DocIdLabel.setText("Doc. Identidad");

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

        Title.setText("Registro de Pacientes");

        DocIdLabelInput.setPreferredSize(new java.awt.Dimension(325, 35));
        DocIdLabelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocIdLabelInputActionPerformed(evt);
            }
        });

        ConfrimacionInsertLabel.setText("jLabel1");

        AMaternoLabel.setText("Apellido Materno");

        AMaternoInput.setPreferredSize(new java.awt.Dimension(325, 35));
        AMaternoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMaternoInputActionPerformed(evt);
            }
        });

        TelefonoLabel.setText("Teléfono");

        TelefonoLabelInput.setPreferredSize(new java.awt.Dimension(325, 35));
        TelefonoLabelInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoLabelInputActionPerformed(evt);
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
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AMaternoInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombresInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(APaternoInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NombresLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(APaternoLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(115, 115, 115))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AMaternoLabel)
                            .addComponent(ConfrimacionInsertLabel)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(GuardarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CancelarButton)))
                        .addGap(312, 312, 312)))
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(TelefonoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TelefonoLabelInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(DocIdLabelInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EmailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DocIdLabel, javax.swing.GroupLayout.Alignment.LEADING))
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
                    .addComponent(NombresLabel)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombresInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APaternoLabel)
                    .addComponent(DocIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APaternoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocIdLabelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AMaternoLabel)
                    .addComponent(TelefonoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AMaternoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelefonoLabelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarButton)
                    .addComponent(CancelarButton))
                .addGap(18, 18, 18)
                .addComponent(ConfrimacionInsertLabel)
                .addContainerGap(185, Short.MAX_VALUE))
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

    private void APaternoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APaternoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_APaternoInputActionPerformed

    private void NombresInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresInputActionPerformed

    private void EmailInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailInputActionPerformed

    private void DocIdLabelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocIdLabelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DocIdLabelInputActionPerformed

    private void GuardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarButtonActionPerformed
        paciente paciente = new paciente();
        
        try {
            paciente.setDocid(Integer.parseInt(DocIdLabelInput.getText()));
            paciente.setName(NombresInput.getText());
            paciente.setApaterno(APaternoInput.getText());
            paciente.setAmaterno(AMaternoInput.getText());
            paciente.setEmail(EmailInput.getText());
            
            if (paciente.getName().isEmpty() || paciente.getApaterno().isEmpty() || 
                paciente.getAmaterno().isEmpty() || paciente.getEmail().isEmpty()) {
                throw new IllegalArgumentException("Todos los campos son obligatorios.");
            }

            ClinicaApp dao = new ClinicaApp();
            dao.registrarPaciente(paciente);

            javax.swing.JOptionPane.showMessageDialog(this, "Paciente registrado exitosamente.");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El DocID debe ser un número válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar paciente: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void AMaternoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMaternoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMaternoInputActionPerformed

    private void TelefonoLabelInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoLabelInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoLabelInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AMaternoInput;
    private javax.swing.JLabel AMaternoLabel;
    private javax.swing.JTextField APaternoInput;
    private javax.swing.JLabel APaternoLabel;
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel ConfrimacionInsertLabel;
    private javax.swing.JLabel DocIdLabel;
    private javax.swing.JTextField DocIdLabelInput;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton GuardarButton;
    private javax.swing.JTextField NombresInput;
    private javax.swing.JLabel NombresLabel;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JTextField TelefonoLabelInput;
    private javax.swing.JLabel Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
