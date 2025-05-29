package mt.mentalist;

import javax.swing.SwingUtilities;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import mt.mentalist.gui.Ingreso;

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
