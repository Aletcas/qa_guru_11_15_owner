package aletca.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class CheckTests extends TestBase {

    @Test
    @DisplayName("Проверка наличия лого.")
    public void logoCheckTest() {

        step("перейти на страницу", () -> {
            open("https://smolensk.hh.ru/employer/3323853");
        });

        step("проверить правильность отображения лого", () -> {
            $(".employer-sidebar__logo").shouldHave(attribute("alt", "NABIX"));
        });
    }
}