package  mt.mentalist.GuiFuctions;


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
