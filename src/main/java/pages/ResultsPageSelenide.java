package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class ResultsPageSelenide {
    private ElementsCollection results = $$("div.g");

    public ElementsCollection getResults() {
        return results;
    }

    public void clickGitHubLink() {
        $x("//span[text()='selenide/selenide: Concise UI Tests with Java! - GitHub']").click();
        $(By.linkText("README.md")).click();

    }
}
