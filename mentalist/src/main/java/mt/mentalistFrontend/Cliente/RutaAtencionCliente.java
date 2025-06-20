package mt.mentalistFrontend.Cliente;


import mt.mentalistFrontend.Modelo.DTO.CasoDTO;
import mt.mentalistFrontend.Modelo.DTO.RutaAtencionDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static mt.mentalistFrontend.Util.JsonUtils.fromJsonListRutaAtencionDTO;

public class RutaAtencionCliente {
    private static final String BASE_URL = " http:localhost:8084/mentalist-web/basicos/casos";

    public static List<RutaAtencionDTO> obtenerRutaAtencion() throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Autorizacion", "Bearer" + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJsonListRutaAtencionDTO(respuesta.toString(), RutaAtencionDTO.class);

    }

    public static RutaAtencionDTO guardarRutaAtencion(RutaAtencionDTO dto) throws Exception {
        URL url = new URL(BASE_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Autorizacion", "Bearer" + SesionUsuario.getToken());
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
        return JsonUtils.fromJson(respuesta.toString(), RutaAtencionDTO.class);
    }

    public static RutaAtencionDTO BuscarRutaAtenciomPorId() throws Exception {
        URL url = new URL(BASE_URL + "/" + BuscarRutaAtenciomPorId());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Autorizacion", "Bearer" + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJson(respuesta.toString(), RutaAtencionDTO.class);
    }

    public static void eliminarRutaAtenciomPorId(int RutaAtenciomPorId) throws Exception {
        URL url = new URL(BASE_URL + "/" + RutaAtenciomPorId);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Autorizacion", "Bearer" + url.openConnection());
        conn.getInputStream().close();
    }
}
