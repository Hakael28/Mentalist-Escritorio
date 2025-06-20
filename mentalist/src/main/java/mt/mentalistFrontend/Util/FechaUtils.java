package mt.mentalistFrontend.Util;


import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


public class FechaUtils{


    private static final String FORMATO_MOSTRAR = "dd/MM/yyyy";
    private static final String FORMATO_BASE_DATOS = "yyyy-MM-dd";

    public static String formatearFecha(Date fecha) {
        if (fecha == null) return "";
        return new SimpleDateFormat(FORMATO_MOSTRAR).format(fecha);
    }

    public static Date parsearFecha(String fechaStr) {
        try {
            return new SimpleDateFormat(FORMATO_MOSTRAR).parse(fechaStr);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String formatearParaBD(Date fecha) {
        if (fecha == null) return null;
        return new SimpleDateFormat(FORMATO_BASE_DATOS).format(fecha);
    }

    public static Date parsearDesdeBD(String fechaStr) {
        try {
            return new SimpleDateFormat(FORMATO_BASE_DATOS).parse(fechaStr);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String obtenerFechaActual() {
        return formatearFecha(new Date());
    }

    public static Date obtenerFechaActualDate() {
        return new Date();
    }

    // Crear un JDatePickerImpl ya configurado
    public static JDatePickerImpl crearDatePicker() {
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Hoy");
        p.put("text.month", "Mes");
        p.put("text.year", "Año");

        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        return new JDatePickerImpl(datePanel, new DatePickerFormatter());
    }
}