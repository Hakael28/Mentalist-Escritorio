package mt.mentalistFrontend.Cliente.Seguridad;

import mt.mentalistFrontend.Modelo.DTO.Seguridad.LoginRequestDTO;
import mt.mentalistFrontend.Modelo.DTO.Seguridad.LoginResponseDTO;
import mt.mentalistFrontend.Util.JsonUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AuthCliente {

    private static final String Base_URL ="http://localhost:8084/auth/login";

    public static LoginResponseDTO login(LoginRequestDTO request)throws Exception{
        URL url = new URL(Base_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        try (OutputStream os = conn.getOutputStream()) {
            os.write(JsonUtils.toJson(request).getBytes());
            os.flush();
        }

        try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))){
            StringBuilder respuesta = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine())!= null){
                respuesta.append(inputLine);
            }
            return JsonUtils.fromJson(respuesta.toString(), LoginResponseDTO.class);
        }
    }
}
