package mt.mentalistFrontend.Cliente;

import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class Cie11Cliente {

    private static final String Base_URL= "http://localhost:8084/cie11/sugerencias";

    public static List<Map<String ,String>> obtenerSugerencias(String texto) throws Exception{
        String queryParam = URLEncoder.encode(texto, StandardCharsets.UTF_8);
        URL url = new URL(Base_URL+ "?q="+queryParam);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer"+ SesionUsuario.getToken());

        BufferedReader in= new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder respuesta =new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null){
            respuesta.append(inputLine);
        }
        in.close();
        return JsonUtils.fromJsonListMap(respuesta.toString());
    }
}
