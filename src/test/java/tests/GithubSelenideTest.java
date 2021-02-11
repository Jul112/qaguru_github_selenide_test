package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubSelenideTest {

    @Test
    void githubSelenideTest() {
       open("https://github.com");
       //open("/selenide/selenide");
        $("[name=q]").val("selenide").pressEnter();
        $("em").shouldHave(text("selenide")).click();
        $(".BorderGrid-cell").shouldHave(text("Concise UI Tests with Java!"));
        $("span[data-content=Wiki]").click();
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $$(".Box-row").find(text("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}

/*- Откройте страницу Selenide в Github
 - Перейдите в раздел Wiki проекта
 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5*/