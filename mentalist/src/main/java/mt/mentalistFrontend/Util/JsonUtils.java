package mt.mentalistFrontend.Util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mt.mentalistFrontend.Modelo.DTO.*;
import mt.mentalistFrontend.Modelo.DTO.Basicas.*;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtils {

    private static final Gson gson = new Gson();

    public static String toJson(Object objeto) {
        return gson.toJson(objeto);
    }

    public static <T> T fromJson(String json, Class<T> clase) {
        return gson.fromJson(json, clase);
    }

    public static List<CasoDTO> fromJsonListCasoDTO(String json, Class<CasoDTO> casoDTOClass) {
        Type tipoLista = new TypeToken<List<CasoDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<DiagnosticoEspecificoDTO> fromJsonListDiagnosticoDTO(String json, Class<DiagnosticoEspecificoDTO> diagnosticoEspecificoDTOClass) {
        Type tipoLista = new TypeToken<List<DiagnosticoEspecificoDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<CursoVidaDTO> fromJsonListCursoVidaDTO(String json) {
        Type tipoLista = new TypeToken<List<CursoVidaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<HistoriaClinicaDTO> fromJsonListHistoriaClinicaDTO(String json, Class<HistoriaClinicaDTO> historiaClinicaDTOClass) {
        Type tipoLista = new TypeToken<List<HistoriaClinicaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<RutaAtencionDTO> fromJsonListRutaAtencionDTO(String json, Class<RutaAtencionDTO> RutaAtencionDTOClass) {
        Type tipoLista = new TypeToken<List<RutaAtencionDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }

    public static List<AreaOcurrenciaDTO> fromJsonListAreaOcurrenciaDTO(String json, Class<AreaOcurrenciaDTO> AreaOcurrenciaDTOClass) {
        Type tipoLista = new TypeToken<List<AreaOcurrenciaDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);

    }

    public static List<EapbDTO> fromJsonListEapbDTO(String json, Class<EapbDTO> EapbDTOClass) {
        Type tipoLista = new TypeToken<List<EapbDTO>>() {
        }.getType();
        return gson.fromJson(json, tipoLista);
    }


}
