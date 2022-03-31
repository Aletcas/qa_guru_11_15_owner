package aletca.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:local.properties",
        "classpath:selenoid.properties"
})
public interface ProjectConfig extends Config {

    @DefaultValue("chrome")
    String browserName();
    @DefaultValue("91.0")
    String browserVersion();
    @DefaultValue("1920x1080")
    String browserSize();
    String browserMobileView();
    String remoteDriverUrl();
    String videoStorage();
}
