package aletca.apiConfig;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:token.properties",
        "system:properties"
})

public interface ApiConfig extends Config {

    String baseUrl();

    String tokenFromFile();

    String tokenProperty();
}
