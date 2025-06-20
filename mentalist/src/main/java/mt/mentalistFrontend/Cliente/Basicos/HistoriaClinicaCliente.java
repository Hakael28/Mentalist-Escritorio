package mt.mentalistFrontend.Cliente.Basicos;

import mt.mentalistFrontend.Modelo.DTO.Basicas.HistoriaClinicaDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class HistoriaClinicaCliente {
    private static final String BASE_URL = "http://localhost:8084/mentalist-web/basicos/historias";

    public static List<HistoriaClinicaDTO> obtenerHistorias() throws Exception {
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

        return JsonUtils.fromJsonListHistoriaClinicaDTO(respuesta.toString());
    }

    public static HistoriaClinicaDTO agregarHistoria(HistoriaClinicaDTO dto) throws Exception {
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

        return JsonUtils.fromJson(respuesta.toString(), HistoriaClinicaDTO.class);
    }

    public static HistoriaClinicaDTO buscarHistoriaPorId(int idHistorialClinica) throws Exception {
        URL url = new URL(BASE_URL + "/" + idHistorialClinica);
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

        return JsonUtils.fromJson(respuesta.toString(), HistoriaClinicaDTO.class);
    }

    public static void eliminarHistoria(int idHistorialClinica) throws Exception {
        URL url = new URL(BASE_URL + "/" + idHistorialClinica);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.getInputStream().close();
    }
}