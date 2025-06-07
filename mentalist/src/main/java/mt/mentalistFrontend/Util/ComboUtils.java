package mt.mentalistFrontend.Util;

import javax.swing.*;
import java.util.List;

public class ComboUtils {

    public static <T> void  llenarCombo(JComboBox<T> combo, List<T> elementos){
        combo.removeAllItems();
        for (T elemento : elementos){
            combo.addItem(elemento);
        }
    }

    public static <T> T obtenerSeleccionado(JComboBox<T>combo){
        return (T) combo.getSelectedItem();
    }

    public static <T> void seleccionarItem(JComboBox<T> combo, T valor){
        combo.setSelectedItem(valor);
    }
}
