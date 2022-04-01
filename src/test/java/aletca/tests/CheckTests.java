package aletca.tests;

import aletca.config.ProjectConfig;
import aletca.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckTests extends TestBase {


    @Test
    void checkFromLocalPropertiesFile() {
        System.setProperty("runType", "local");
        ProjectConfig owner = ConfigFactory.create(ProjectConfig.class, System.getProperties());
        Assertions.assertEquals("chrome", owner.browserName());
        Assertions.assertEquals("99.0", owner.browserVersion());
    }


    @Test
    @DisplayName("Проверка наличия лого.")
    public void logoCheckTest() {
        WebDriverConfig owner = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        step("перейти на страницу", () -> {
            open( owner.getBaseUrl());

        });

        step("проверить правильность отображения лого", () -> {
            $(".employer-sidebar__logo").shouldHave(attribute("alt", "NABIX"));
        });
    }
}