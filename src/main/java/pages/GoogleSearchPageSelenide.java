package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import  static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class GoogleSearchPageSelenide {
    SelenideElement searchField = $(By.name("q"));
    SelenideElement searchButton = $(Selectors.byValue("Пошук Google"));

    public GoogleSearchPageSelenide sendSearchQuery(String query) {
        searchField.shouldBe(visible).sendKeys(query);
        return this;
    }

    public GoogleSearchPageSelenide pressSearch() {
        searchButton.click();
        return this;
    }

//    public GoogleSearchPage goToTheGithu
}
