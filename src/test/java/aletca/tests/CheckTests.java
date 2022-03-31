package aletca.tests;

import aletca.config.demo.AppConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckTests extends TestBase {

    @Test
    @DisplayName("Проверка наличия лого.")
    public void logoCheckTest() {
        step("перейти на страницу", () -> {
            open(baseUrl);
        });

        step("проверить правильность отображения лого", () -> {
            $(".employer-sidebar__logo").shouldHave(attribute("alt", "NABIX"));
        });
    }
}