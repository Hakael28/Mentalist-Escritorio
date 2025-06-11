package mt.mentalistFrontend.Util;

import lombok.Getter;

@Getter
public class SesionUsuario {

    private static String token;
    private static String rol;
    private static String nombre;

    public static void establecerSesion(String tokenNuevo, String rolNuevo, String nombreNuevo){
        token =tokenNuevo;
        rol = rolNuevo;
        nombre = nombreNuevo;
    }

    public static void cerrarSesion(){
        token = null;
        rol = null;
        nombre = null;
    }

    public static Object getToken() {
        return token;
    }
}
