package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    By resultHeaderBy = By.xpath("//h3/span");
    private By resultContainer = By.id("rso");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;

        if (!this.driver.getTitle().contains(" - Пошук Google")) {
            throw new IllegalStateException("Wrong page loaded");
        }
    }

    public WebElement getSearchResultByText (String headerText) {
        By headerBy = By.xpath("//h3/span[text()='" + headerText + "']");
        return driver.findElement(resultContainer).findElement(headerBy);
    }

}
