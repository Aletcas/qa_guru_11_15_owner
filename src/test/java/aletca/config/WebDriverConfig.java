package aletca.config;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;


@Config.Sources({"classpath:${type}.properties"})
public interface WebDriverConfig extends Config{

    @Key("baseUrl")
    @DefaultValue("https://smolensk.hh.ru/employer/3323853")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("chrome")
    Browser getBrowser();

    @Key("selenoidUrl")
    String selenoidUrl();
}
