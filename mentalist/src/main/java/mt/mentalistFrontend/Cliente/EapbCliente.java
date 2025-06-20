package mt.mentalistFrontend.Cliente;

import lombok.extern.slf4j.Slf4j;
import mt.mentalistFrontend.Modelo.DTO.EapbDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

@Slf4j
public class EapbCliente {
    private static final String BASE_URL = "http://localhost:8084/mentalist-web/basicos/Eapb";

    public static List<EapbDTO> obtenerEapbs() throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Autorization", "Bearer" + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();
        return JsonUtils.fromJsonListEapbDTO(respuesta.toString(), EapbDTO.class);

    }

    public static EapbDTO agregarEapb(EapbDTO dto) throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Autorization", "Bearer" + SesionUsuario.getToken());
        conn.setRequestProperty("Contet-Type", "application");
        conn.setDoOutput(true);
        OutputStream os = conn.getOutputStream();
        os.write(JsonUtils.toJson(dto).getBytes());
        os.flush();
        os.close();

        BufferedReader in = new BufferedReader((new InputStreamReader(conn.getInputStream())));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), EapbDTO.class);
    }

    public static EapbDTO buscarEapbPorId(int idEapb) throws Exception {
        URL url = new URL(BASE_URL + "/" + idEapb);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Autorization", "Bearer" + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), EapbDTO.class);

    }

    public static void eliminarEapbPorId(int idEapb) throws Exception {
        URL url = new URL((BASE_URL + "/" + idEapb));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Autorization", "Bearer" + SesionUsuario.getToken());
        conn.getInputStream().close();

    }
}
