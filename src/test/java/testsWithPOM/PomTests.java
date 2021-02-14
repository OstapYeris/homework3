package testsWithPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import pages.SearchResultsPage;
import setUpClasses.BaseWebDriver;

public class PomTests extends BaseWebDriver {
  @Test
  public void test1() {
    driver.get("https://www.google.com");
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    googleSearchPage.sendSearchQuery("Selenium Webdriver");

    SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
    searchResultsPage.getSearchResultByText("WebDriver :: Documentation for Selenium").click();

    Assert.assertTrue(driver.getTitle().contains("WebDriver :: Documentation for Selenium"));
  }

  @Test
  public void test2() {
    driver.get("https://www.google.com");
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    googleSearchPage.sendSearchQuery("Selenium Webdriver");

    pageFactory.SearchResultsPage searchResultsPage = new pageFactory.SearchResultsPage(driver);
    searchResultsPage.getSearchResultByText("WebDriver :: Documentation for Selenium").click();

    Assert.assertTrue(driver.getTitle().contains("WebDriver :: Documentation for Selenium"));
  }

  @Test
  public void test3() {
    driver.get("https://www.google.com");
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    googleSearchPage.clickLuckyButon();

    Assert.assertEquals(driver.getTitle(), "Google Doodles");
  }
}
