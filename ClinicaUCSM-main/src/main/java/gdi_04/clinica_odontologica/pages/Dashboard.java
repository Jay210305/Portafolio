package gdi_04.clinica_odontologica.pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;

import javax.swing.JPanel; 
public class Dashboard extends javax.swing.JFrame {

    private void InitStyles() {
        Title.putClientProperty("FlatLaf.styleClass", "h1");
        UCSM.setForeground(Color.white);
        UCSM.putClientProperty("FlatLaf.styleClass", "h00");
        Fecha.putClientProperty("FlatLaf.styleClass", "h2");
    }
    
    private void InitContent(){
        Home p1  = new Home();
        p1.setSize(960, 620);
        p1.setLocation(0, 0);
        Content.removeAll();
        Content.add(p1, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    public Dashboard() {
        initComponents();
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        Fecha.setText("Hoy es " + day + " de " + meses[month-1] + " de " + year);
        InitStyles();
        InitContent();
    }
    private void ShowJPanel(JPanel p){
        p.setSize(960, 620);
        p.setLocation(0, 0);
        Content.removeAll();
        Content.add(p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        SideBarPanel = new javax.swing.JPanel();
        RegistroDePaciente = new javax.swing.JButton();
        HomeButton = new javax.swing.JButton();
        RegistroDeCitasButton = new javax.swing.JButton();
        ListadoDeCitasButton = new javax.swing.JButton();
        GestionDeEstudiantesButton = new javax.swing.JButton();
        GestionDePorteriaButton = new javax.swing.JButton();
        UCSM = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        GestionDePorteriaButton1 = new javax.swing.JButton();
        TopBarPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setPreferredSize(new java.awt.Dimension(1280, 720));

        SideBarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 90, 149)));
        SideBarPanel.setPreferredSize(new java.awt.Dimension(320, 720));

        RegistroDePaciente.setText("Registro de Pacientes");
        RegistroDePaciente.setPreferredSize(new java.awt.Dimension(306, 55));
        RegistroDePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDePacienteActionPerformed(evt);
            }
        });

        HomeButton.setText("Home");
        HomeButton.setPreferredSize(new java.awt.Dimension(306, 55));
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        RegistroDeCitasButton.setText("Registro de Citas");
        RegistroDeCitasButton.setPreferredSize(new java.awt.Dimension(306, 55));
        RegistroDeCitasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeCitasButtonActionPerformed(evt);
            }
        });

        ListadoDeCitasButton.setText("Listado de Citas");
        ListadoDeCitasButton.setPreferredSize(new java.awt.Dimension(306, 55));
        ListadoDeCitasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoDeCitasButtonActionPerformed(evt);
            }
        });

        GestionDeEstudiantesButton.setText("Gestión de Estudiantes");
        GestionDeEstudiantesButton.setPreferredSize(new java.awt.Dimension(306, 55));
        GestionDeEstudiantesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionDeEstudiantesButtonActionPerformed(evt);
            }
        });

        GestionDePorteriaButton.setText("Gestión de Portería");
        GestionDePorteriaButton.setPreferredSize(new java.awt.Dimension(306, 55));
        GestionDePorteriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionDePorteriaButtonActionPerformed(evt);
            }
        });

        UCSM.setText("UCSM");

        jSeparator1.setBackground(new java.awt.Color(29, 90, 126));
        jSeparator1.setForeground(new java.awt.Color(29, 90, 126));

        GestionDePorteriaButton1.setText("Filtros");
        GestionDePorteriaButton1.setPreferredSize(new java.awt.Dimension(306, 55));
        GestionDePorteriaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionDePorteriaButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(UCSM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistroDePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RegistroDeCitasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListadoDeCitasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GestionDeEstudiantesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GestionDePorteriaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GestionDePorteriaButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(UCSM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(HomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistroDePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegistroDeCitasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListadoDeCitasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GestionDeEstudiantesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GestionDePorteriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GestionDePorteriaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TopBarPanel.setBackground(new java.awt.Color(29, 90, 149));

        Title.setText("Clínica Odontológica UCSM");

        Fecha.setText("jLabel1");

        javax.swing.GroupLayout TopBarPanelLayout = new javax.swing.GroupLayout(TopBarPanel);
        TopBarPanel.setLayout(TopBarPanelLayout);
        TopBarPanelLayout.setHorizontalGroup(
            TopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fecha)
                .addGap(25, 25, 25))
        );
        TopBarPanelLayout.setVerticalGroup(
            TopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(TopBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title)
                    .addComponent(Fecha))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(SideBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(TopBarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroDePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDePacienteActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Registro_de_Pacientes());
    }//GEN-LAST:event_RegistroDePacienteActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Home());
    }//GEN-LAST:event_HomeButtonActionPerformed

    private void RegistroDeCitasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeCitasButtonActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Registro_de_Citas());
    }//GEN-LAST:event_RegistroDeCitasButtonActionPerformed

    private void ListadoDeCitasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoDeCitasButtonActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Listado_Citas());
    }//GEN-LAST:event_ListadoDeCitasButtonActionPerformed

    private void GestionDeEstudiantesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionDeEstudiantesButtonActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new Gestion_de_estudiantes());
    }//GEN-LAST:event_GestionDeEstudiantesButtonActionPerformed

    private void GestionDePorteriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionDePorteriaButtonActionPerformed
        Porteria porteria = new Porteria();
                    porteria.setVisible(true);
    }//GEN-LAST:event_GestionDePorteriaButtonActionPerformed

    private void GestionDePorteriaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionDePorteriaButton1ActionPerformed
        
        ShowJPanel(new Filtros());
    }//GEN-LAST:event_GestionDePorteriaButton1ActionPerformed

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Content;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton GestionDeEstudiantesButton;
    private javax.swing.JButton GestionDePorteriaButton;
    private javax.swing.JButton GestionDePorteriaButton1;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton ListadoDeCitasButton;
    private javax.swing.JButton RegistroDeCitasButton;
    private javax.swing.JButton RegistroDePaciente;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TopBarPanel;
    private javax.swing.JLabel UCSM;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
