package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubSelenideTest {

    @Test
    void githubSelenideTest() {
       Configuration.baseUrl="https://github.com";
       open("/selenide/selenide");

       $("div.BorderGrid-cell p").shouldHave(text("Concise UI Tests with Java!"));
       open("/selenide/selenide/wiki");
       //$("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("span[data-content=Wiki]").click();
       open("/selenide/selenide/wiki/SoftAssertions");
       $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));
    }
}

/*- Откройте страницу Selenide в Github
 - Перейдите в раздел Wiki проекта
 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5*/