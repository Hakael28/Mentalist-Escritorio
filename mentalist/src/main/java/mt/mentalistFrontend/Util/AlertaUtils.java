package mt.mentalistFrontend.Util;

import javax.swing.*;

public class AlertaUtils {

    public static void mostrarInfo(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarError(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarAdvertencia(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarExito(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje,"Exito", JOptionPane.PLAIN_MESSAGE);
    }
}
