package mt.mentalistFrontend.Util;
import com.google.gson.Gson;

public class JsonUtils {

    private static final Gson gson = new Gson();

    public static String toJson(Object objeto){
        return gson.toJson(objeto);
    }
    public static <T> T fromJson(String json, Class<T> clase){
        return gson.fromJson(json,clase);
    }
}