package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    WebDriver driver;

    @FindBy(id = "rso")
    private WebElement resultContainer;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);

        if (!this.driver.getTitle().contains(" - Пошук Google")) {
            throw new IllegalStateException("Wrong page loaded");
        }
    }

    public WebElement getSearchResultByText (String headerText) {
        By headerBy = By.xpath("//h3/span[text()='" + headerText + "']");
        return resultContainer.findElement(headerBy);
    }

}
