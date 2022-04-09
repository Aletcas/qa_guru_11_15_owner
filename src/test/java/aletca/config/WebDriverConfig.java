package aletca.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${type}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browserName")
    @DefaultValue("Chrome")
    String browserName();

    @Key("browserVersion")
    String BrowserVersion();

    @Key("browserSize")
    @DefaultValue("1920x1080")
    String BrowserSize();

    @Key("remoteUrl")
    String remoteUrl();

    @Key("baseUrl")
    String getBaseUrl();
}