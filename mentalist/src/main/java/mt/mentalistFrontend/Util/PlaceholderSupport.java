package  mt.mentalistFrontend.Util;

/**
 * Clase utilitaria para aplicar un texto sugerido (placeholder) en campos JTextField.
 *
 * Esta clase permite simular el comportamiento de un placeholder en Swing,
 * cambiando el texto y color del campo cuando gana o pierde el foco.
 *
 * Ejemplo de uso:
 * PlaceholderSupport.aplicar(miCampoTexto, "Ingrese su nombre");
 *
 */
import java.awt.*;
import  javax.swing.*;
import  java.awt.event.*;

public class PlaceholderSupport {
    public static void aplicar(JTextField campo, String placeholder){
        campo.setText(placeholder);
        campo.setForeground(new Color (107, 129, 154));
        
        campo.addFocusListener(new FocusAdapter(){
         @Override
         public void focusGained(FocusEvent e){
             if(campo.getText().equals(placeholder)){
                 campo.setText("");
                 campo.setForeground(Color.black);
                }
            }
         
         @Override
         public void focusLost(FocusEvent e){
             if(campo.getText().trim().isEmpty()){
                 campo.setText(placeholder);
                 campo.setForeground(new Color(107, 129, 154));
             }
         }
    });
}
}
