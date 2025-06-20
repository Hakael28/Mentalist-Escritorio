package mt.mentalistFrontend.Cliente.Funciones.PDF;

import mt.mentalistFrontend.Modelo.DTO.PDF.GraficoFiltroDTO;
import mt.mentalistFrontend.Util.JsonUtils;
import mt.mentalistFrontend.Util.SesionUsuario;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GraficoPDFCliente {
    private static void descargarGrafico(String endpoint, GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        URL url = new URL("http://localhost:8084/mentalist-web/graficos/pdf/" + endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Authorization", "Bearer " + SesionUsuario.getToken());

        try (OutputStream os = conn.getOutputStream()) {
            os.write(JsonUtils.toJson(filtro).getBytes());
        }

        try (InputStream is = conn.getInputStream();
             FileOutputStream fos = new FileOutputStream(rutaArchivo)) {
            byte[] buffer = new byte[4096];
            int byteRead;
            while ((byteRead = is.read(buffer)) != -1) {
                fos.write(buffer, 0, byteRead);
            }
        }
    }

    public static void descargarGraficoCursoVida(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("curso-vida", filtro, rutaArchivo);
    }

    public static void descargarGraficoSexo(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("sexo", filtro, rutaArchivo);
    }

    public static void descargarGraficoFecha(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("fecha", filtro, rutaArchivo);
    }

    public static void descargarGraficoMes(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("mes", filtro, rutaArchivo);
    }

    public static void descargarGraficoSemana(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("semana", filtro, rutaArchivo);
    }

    public static void descargarGraficoCombinado(GraficoFiltroDTO filtro, String rutaArchivo) throws Exception {
        descargarGrafico("combinado", filtro, rutaArchivo);
    }
}