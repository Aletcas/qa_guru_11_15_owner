package aletca.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.FIREFOX;

public class WebDriverProvider implements Supplier<WebDriver> {

    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Override
    public WebDriver get() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseUrl());
        return driver;
    }

    private WebDriver createWebDriver() {
        if (Objects.nonNull(config.getBrowser())) {
            switch (config.getBaseUrl()) {
                case CHROME: {
                    return new ChromeDriver();
                }
                case FIREFOX: {
                    return new FirefoxDriver();
                }
                default: {
                    throw new RuntimeException("тип браузера не поддерживается");
                }
            }
        }
        throw new RuntimeException("нет такого браузера");
    }
}

