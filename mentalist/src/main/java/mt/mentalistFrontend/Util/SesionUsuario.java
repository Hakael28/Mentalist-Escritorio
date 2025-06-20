package mt.mentalistFrontend.Util;

import lombok.Data;

@Data
public class SesionUsuario {

    private static String token;
    private static String rol;
    private static String nombre;
    private static Integer idUsuario;

    public static String getToken() {
        return token;
    }

    public static Integer getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(Integer idUsuario) {
        SesionUsuario.idUsuario = idUsuario;
    }

    public static void setToken(String token) {
        SesionUsuario.token = token;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        SesionUsuario.nombre = nombre;
    }

    public static String getRol() {
        return rol;
    }

    public static void setRol(String rol) {
        SesionUsuario.rol = rol;
    }

    public static void establecerSesion(String tokenNuevo, String rolNuevo, String nombreNuevo, Integer idUsuarioNuevo) {
        token = tokenNuevo;
        rol = rolNuevo;
        nombre = nombreNuevo;
        idUsuario = idUsuarioNuevo;
    }

    public static void cerrarSesion() {
        token = null;
        rol = null;
        nombre = null;
        idUsuario = null;
    }
}
