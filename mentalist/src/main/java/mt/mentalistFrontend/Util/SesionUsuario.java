package mt.mentalistFrontend.Util;

import lombok.Data;

@Data
public class SesionUsuario {

    private static String token;
    private static String rol;
    private static String nombre;
    private static Integer idUsuario;
    private static String correo;
    private static String telefono;
    private static String usuario;

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        SesionUsuario.usuario = usuario;
    }

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

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        SesionUsuario.correo = correo;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        SesionUsuario.telefono = telefono;
    }

    public static void setRol(String rol) {
        SesionUsuario.rol = rol;
    }

    public static void establecerSesion(String tokenNuevo, String rolNuevo, String nombreNuevo, Integer idUsuarioNuevo, String correoNuevo, String telefonoNuevo, String usuarioNuevo) {
        token = tokenNuevo;
        rol = rolNuevo;
        nombre = nombreNuevo;
        idUsuario = idUsuarioNuevo;
        correo = correoNuevo;
        telefono = telefonoNuevo;
        usuario = usuarioNuevo;
    }

    public static void cerrarSesion() {
        token = null;
        rol = null;
        nombre = null;
        idUsuario = null;
        correo = null;
        telefono = null;
        usuario = null;
    }
}
