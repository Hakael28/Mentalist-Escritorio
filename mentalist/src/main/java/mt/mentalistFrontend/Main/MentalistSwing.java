package mt.mentalistFrontend.Main;

import javax.swing.SwingUtilities;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import mt.mentalistFrontend.UI.Ventanas.Ingreso;

public class MentalistSwing {

    public static void main(String[] args) {

        FlatMaterialLighterIJTheme.setup();
        // Iniciar la ventana principal (Ingreso)
        SwingUtilities.invokeLater(() -> {
            System.setProperty("sun.java2d.uiScale", "1.0");

            Ingreso ventanaIngreso = new Ingreso();
            ventanaIngreso.setVisible(true);

        });
    }
}
