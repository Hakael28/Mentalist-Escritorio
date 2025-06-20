package mt.mentalistFrontend.Cliente.Basicos;

import mt.mentalistFrontend.Modelo.DTO.Basicas.CursoVidaDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CursoVidaCliente {
    private static final String Base_URL = "//http://localhost:8084/mentalist-web/basicos/cursoVida";

    public static List<CursoVidaDTO> obtenerCursoVida() throws Exception {
        URL url = new URL(Base_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader((new InputStreamReader(conn.getInputStream())));
        StringBuilder respuesta = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            respuesta.append(inputLine);
        }
        in.close();

        return JsonUtils.fromJsonListCursoVidaDTO(respuesta.toString());

    }

    public static CursoVidaDTO agreagarCursoVida(CursoVidaDTO dto) throws Exception {
        URL url = new URL(Base_URL);
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

        return JsonUtils.fromJson(respuesta.toString(), CursoVidaDTO.class);
    }

    public static CursoVidaDTO GuardarCursoVidaPorId(int idCursoVida) throws Exception {

        URL url = new URL(Base_URL + "/" + idCursoVida);
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
        return JsonUtils.fromJson(respuesta.toString(), CursoVidaDTO.class);

    }
     public  static  void  eliminarCursoVida(int idCursoVida) throws  Exception {
       URL url = new URL(Base_URL+"/" + idCursoVida);
       HttpURLConnection conn = (HttpURLConnection) url.openConnection();
       conn.setRequestMethod("DELETE");
         conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());
       conn.getInputStream().close();
     }

}
