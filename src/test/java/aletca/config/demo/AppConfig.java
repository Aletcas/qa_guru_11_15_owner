package aletca.config.demo;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:api.properties"
})
public interface AppConfig extends Config {

    String webUrl();
    String apiUrl();
    String userLogin();
    String userPassword();

    @Key("testUrl")
    URL url();
}