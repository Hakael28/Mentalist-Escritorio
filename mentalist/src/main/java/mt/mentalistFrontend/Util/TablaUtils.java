package mt.mentalistFrontend.Util;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.util.List;
import java.util.function.Function;

public class TablaUtils {
    // Cargar lista genérica a la tabla
    public static <T> void cargarTabla(JTable tabla, List<T> lista, String[] columnas, Function<T, Object[]> mapeador) {
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // evita que se edite directamente en la tabla
            }
        };
        for (T item : lista) {
            modelo.addRow(mapeador.apply(item));
        }
        tabla.setModel(modelo);
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    // Limpia el modelo de tabla
    public static void limpiarTabla(DefaultTableModel modelo) {
        modelo.setRowCount(0);
    }

    // Devuelve el índice de la fila seleccionada o -1 si no hay selección
    public static int getFilaSeleccionada(JTable tabla) {
        return tabla.getSelectedRow();
    }

    // Devuelve el valor de una celda como String
    public static String getValorCelda(JTable tabla, int fila, int columna) {
        Object valor = tabla.getValueAt(fila, columna);
        return valor != null ? valor.toString() : "";
    }

    // Intenta convertir una celda a entero (por ejemplo ID)
    public static Integer getValorEntero(JTable tabla, int fila, int columna) {
        try {
            Object valor = tabla.getValueAt(fila, columna);
            return valor != null ? Integer.parseInt(valor.toString()) : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
