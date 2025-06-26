package mt.mentalistFrontend.Util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mt.mentalistFrontend.Modelo.DTO.Basicas.*;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class JsonUtils {

    private static final Gson gson = new Gson();

    // Serializar
    public static String toJson(Object objeto) {
        return gson.toJson(objeto);
    }

    public static List<Map<String, String>> fromJsonListMap(String json) {
        Type tipoListaMap = new TypeToken<List<Map<String, String>>>() {}.getType();
        return gson.fromJson(json, tipoListaMap);
    }

    // Deserializar un solo objeto
    public static <T> T fromJson(String json, Class<T> clase) {
        return gson.fromJson(json, clase);
    }

    // Deserializar listas

    public static List<CasoDTO> fromJsonListCasoDTO(String json) {
        Type tipoLista = new TypeToken<List<CasoDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<DiagnosticoEspecificoDTO> fromJsonListDiagnosticoDTO(String json) {
        Type tipoLista = new TypeToken<List<DiagnosticoEspecificoDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<CursoVidaDTO> fromJsonListCursoVidaDTO(String json) {
        Type tipoLista = new TypeToken<List<CursoVidaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<HistoriaClinicaDTO> fromJsonListHistoriaClinicaDTO(String json) {
        Type tipoLista = new TypeToken<List<HistoriaClinicaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<RutaAtencionDTO> fromJsonListRutaAtencionDTO(String json) {
        Type tipoLista = new TypeToken<List<RutaAtencionDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<AreaOcurrenciaDTO> fromJsonListAreaOcurrenciaDTO(String json) {
        Type tipoLista = new TypeToken<List<AreaOcurrenciaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<EapbDTO> fromJsonListEapbDTO(String json) {
        Type tipoLista = new TypeToken<List<EapbDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }


    public static List<PacienteDTO> fromJsonListPacienteDTO(String json) {
        Type tipoLista = new TypeToken<List<PacienteDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<UsuarioDTO> fromJsonListUsuarioDTO(String json) {
        Type tipoLista = new TypeToken<List<UsuarioDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<ReporteDTO> fromJsonListReporteDTO(String json) {
        Type tipoLista = new TypeToken<List<UsuarioDTO>>() {}.getType();
        return gson.fromJson(json, tipoLista);
    }

}