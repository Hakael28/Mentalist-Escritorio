package mt.mentalistFrontend.Cliente.Basicos;


import mt.mentalistFrontend.Modelo.DTO.Basicas.AreaOcurrenciaDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class AreaOcurrenciaCliente {
    private static final String Base_URL = "http://localhost:8084/mentalist-web/basicos/areas";

    public static List<AreaOcurrenciaDTO> obtenerAreas() throws Exception {
        URL url = new URL(Base_URL);
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
        return JsonUtils.fromJsonListAreaOcurrenciaDTO(respuesta.toString());
    }

    public static AreaOcurrenciaDTO agregarAreaOcurrencia(AreaOcurrenciaDTO dto) throws Exception {
        URL url = new URL(Base_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer" + SesionUsuario.getToken());
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        OutputStream os = conn.getOutputStream();
        os.write(JsonUtils.toJson(dto).getBytes());
        os.flush();
        os.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputline;
        while ((inputline = in.readLine()) != null) {
            respuesta.append(inputline);
        }
        in.close();
        return JsonUtils.fromJson(respuesta.toString(), AreaOcurrenciaDTO.class);
    }

    public static AreaOcurrenciaDTO buscarAreasPorId(int idAreas) throws Exception {
        URL url = new URL(Base_URL + "/" + idAreas);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer" + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputline;
        while ((inputline = in.readLine()) != null) {
            respuesta.append(inputline);
        }
        in.close();
        return JsonUtils.fromJson(respuesta.toString(), AreaOcurrenciaDTO.class);
    }

    public static void eliminarAreasPorId(int idAreas) throws Exception {
        URL url = new URL(Base_URL + "/" + idAreas);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Authorization", "Bearer" + SesionUsuario.getToken());
        conn.getInputStream().close();
    }

}
