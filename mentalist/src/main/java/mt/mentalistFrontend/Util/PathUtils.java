package mt.mentalistFrontend.Util;

import java.io.File;

public class PathUtils {

    public static String obtenerRutaDescarga(String nombreArchivo){
        String rutaUsuario = System.getProperty("user.home");
        return rutaUsuario + File.separator+"Downloads"+ File.separator + nombreArchivo;
    }

    public static File crearArchivo(String nombreArchivo){
        return new File(obtenerRutaDescarga(nombreArchivo));
    }
}
