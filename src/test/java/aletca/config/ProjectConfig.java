package aletca.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:${runType}.properties")

public interface ProjectConfig extends Config {

    String browserName();

    String browserVersion();

    @Key("remoteUrl")
    URL getRemoteUrl();
}
