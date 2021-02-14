package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage {
  WebDriver driver;

  By searchField = By.name("q");
  By searchButton = By.name("btnK");
  By luckyButton = By.xpath("(//input[@name='btnI'])[2]");

  public GoogleSearchPage(WebDriver webDriver) {
    this.driver = webDriver;

    if (!driver.getTitle().equals("Google")) {
      throw new IllegalStateException(
          "This is not Google search page," + " current page is: " + driver.getCurrentUrl());
    }
  }

  public void sendSearchQuery(String query) {
    driver.findElement(searchField).sendKeys(query + Keys.ENTER);
  }

  public void clickLuckyButon() {
    new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(luckyButton)).click();
  }

}
