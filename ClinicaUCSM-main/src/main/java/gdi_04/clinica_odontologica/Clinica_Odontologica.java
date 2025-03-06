package gdi_04.clinica_odontologica;

import com.formdev.flatlaf.intellijthemes.FlatDarkFlatIJTheme;
import javax.swing.UIManager;
import gdi_04.clinica_odontologica.pages.Dashboard;

public class Clinica_Odontologica {

    public static void main(String[] args) {
        try {
            FlatDarkFlatIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Error al configurar el tema FlatLaf: " + ex.getMessage());
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        });
    }
}
