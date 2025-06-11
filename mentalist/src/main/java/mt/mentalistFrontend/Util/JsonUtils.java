package mt.mentalistFrontend.Util;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import mt.mentalistFrontend.Modelo.DTO.CasoDTO;
import mt.mentalistFrontend.Modelo.DTO.DiagnosticoEspecificoDTO;

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
}

