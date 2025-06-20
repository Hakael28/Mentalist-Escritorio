package mt.mentalistFrontend.Cliente.Basicos;


import mt.mentalistFrontend.Modelo.DTO.Basicas.DiagnosticoEspecificoDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class DiagnosticoEspecificoCliente {
    private static final String BASE_URL = "http://localhost:8084/mentalist-web/basicos/diagnosticos";

    public static List<DiagnosticoEspecificoDTO> obtenerDiagnosticos() throws Exception {
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

        return JsonUtils.fromJsonListDiagnosticoDTO(respuesta.toString());
    }

    public static DiagnosticoEspecificoDTO agregarDiagnostico(DiagnosticoEspecificoDTO dto) throws Exception {
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

        return JsonUtils.fromJson(respuesta.toString(), DiagnosticoEspecificoDTO.class);
    }

    public static DiagnosticoEspecificoDTO buscarDiagnosticoPorId(int idDiagnostico) throws Exception {
        URL url = new URL(BASE_URL + "/" + idDiagnostico);
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

        return JsonUtils.fromJson(respuesta.toString(), DiagnosticoEspecificoDTO.class);
    }

    public static void eliminarDiagnostico(int idDiagnostico) throws Exception {
        URL url = new URL(BASE_URL + "/" + idDiagnostico);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
        conn.getInputStream().close();
    }
}