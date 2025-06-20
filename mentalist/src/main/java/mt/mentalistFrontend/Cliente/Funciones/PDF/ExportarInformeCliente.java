package mt.mentalistFrontend.Cliente.Funciones.PDF;

import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExportarInformeCliente {

    public static void descargarInformeCasoPDF(int idCaso, String rutaArchivo) throws Exception{
        URL url = new URL("http://localhost:8084/mentalist-web/basicos/InformeCaso/pdf/" + idCaso);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization","Bearer" + SesionUsuario.getToken());

        try (InputStream is = conn.getInputStream();
             FileOutputStream fos = new FileOutputStream(rutaArchivo)){
            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = is.read(buffer)) != -1){
                fos.write(buffer, 0, byteRead);
            }
        }
    }

    public static void descargarInformeHistoriaClinicaPDF(int idHistorialClinica, String rutaArchivo) throws Exception {
        URL url = new URL("http://localhost:8084/mentalist-web/basicos/InformeHistoriaClinica/pdf/" + idHistorialClinica);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        try (InputStream is = conn.getInputStream();
             FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
}
