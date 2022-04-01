package aletca.config;

import com.codeborne.selenide.Browser;
import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config{

    @Key("baseUrl")//читаем значение
    @DefaultValue("https://smolensk.hh.ru/employer/3323853")//обрабатываем дефолтное
    String getBaseUrl();//конвертируем результат

    @Key("browser")//читаем значение
    @DefaultValue("chrome")//обрабатываем дефолтное
    Browser getBrowser();//конвертируем результат
}
