package conexionHTTP;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import model.Pokemon;

/**
 *
 * @author alejandro
 */
public class LeerJSONAPI {

    public static Pokemon leer() throws IOException {
        Pokemon pokemon = null;
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        
        pokemon = mapper.readValue(new File("pokemon.json"), Pokemon.class);
        return pokemon;
    }
}
