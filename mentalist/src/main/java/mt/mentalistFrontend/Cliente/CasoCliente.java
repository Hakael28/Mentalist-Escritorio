package mt.mentalistFrontend.Cliente;

import mt.mentalistFrontend.Modelo.DTO.CasoDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CasoCliente {

    private static final String Base_URL = "http://localhost:8084/mentalist-web/basicos/casos";


    public static List<CasoDTO> obtenerCasos() throws Exception {
        URL url = new URL(Base_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta = new StringBuilder();
        String inputLIine;
        while ((inputLIine = in.readLine()) != null) {
            respuesta.append(inputLIine);
        }
        in.close();
        return JsonUtils.fromJsonListCasoDTO(respuesta.toString(), CasoDTO.class);
    }

    public static void eliminarCaso(int idCaso) throws Exception {
        URL url = new URL(Base_URL + "/" + idCaso);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("DELETE");
        conn.setRequestProperty("Autorizacion", "Bearber" + SesionUsuario.getToken());
        conn.getInputStream().close();
    }
}
