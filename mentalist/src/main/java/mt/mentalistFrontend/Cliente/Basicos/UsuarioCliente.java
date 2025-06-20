package mt.mentalistFrontend.Cliente.Basicos;

import mt.mentalistFrontend.Modelo.DTO.Basicas.UsuarioDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
public class UsuarioCliente{
    private static final String BASE_URL = "http://localhost:8084/mentalist-web/basicos/usuarios";

    public static List<UsuarioDTO> obtenerUsuarios() throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJsonListUsuarioDTO(respuesta.toString());
    }

    public static UsuarioDTO agregarUsuario(UsuarioDTO dto) throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        OutputStream os = conn.getOutputStream();
        os.write(JsonUtils.toJson(dto).getBytes());
        os.flush();
        os.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), UsuarioDTO.class);
    }

    public static UsuarioDTO buscarUsuarioPorId(int idUsuario) throws Exception {
        URL url = new URL(BASE_URL + "/" + idUsuario);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), UsuarioDTO.class);
    }

    public static void eliminarUsuarioPorId(int idUsuario) throws Exception {
        URL url = new URL(BASE_URL + "/" + idUsuario);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.getInputStream().close();
    }

    public static UsuarioDTO actualizarUsuarioComoMedico(int idUsuario, UsuarioDTO dto) throws Exception {
        URL url = new URL(BASE_URL + "/" + idUsuario);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        OutputStream os = conn.getOutputStream();
        os.write(JsonUtils.toJson(dto).getBytes());
        os.flush();
        os.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), UsuarioDTO.class);
    }

    public static UsuarioDTO actualizarUsuarioComoAdmin(int idUsuario, UsuarioDTO dto) throws Exception {
        URL url = new URL("http://localhost:8084/mentalist-web/basicos/administrador/" + idUsuario + "/credenciales");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("PUT");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        OutputStream os = conn.getOutputStream();
        os.write(JsonUtils.toJson(dto).getBytes());
        os.flush();
        os.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), UsuarioDTO.class);
    }
}
