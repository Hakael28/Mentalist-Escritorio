package mt.mentalistFrontend.Util;

import javax.swing.JFormattedTextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatePickerFormatter extends JFormattedTextField.AbstractFormatter {
    private static final String FORMATO_MOSTRAR = "dd/MM/yyyy";
    private final SimpleDateFormat formato = new SimpleDateFormat(FORMATO_MOSTRAR);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return formato.parse(text);
    }

    @Override
    public String valueToString(Object value) {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return formato.format(cal.getTime());
        }
        return "";
    }
}
