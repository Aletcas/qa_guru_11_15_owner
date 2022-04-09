package aletca.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Properties;

import static aletca.config.Project.isRemoteWebDriver;


public class DriverConfig {
    public static void configure() {

        Properties properties = System.getProperties();
        String system = properties.getProperty("type");
        if (system == null) {
            System.setProperty("type", "local");
        }

        Configuration.browser = Project.webConfig.browserName();
        Configuration.browserVersion = Project.webConfig.BrowserVersion();
        Configuration.browserSize = Project.webConfig.BrowserSize();
        Configuration.baseUrl = Project.webConfig.getBaseUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = Project.webConfig.remoteUrl();
        }
        Configuration.browserCapabilities = capabilities;
    }
}