package testsWithPOM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import setUpClasses.BaseWebDriver;

public class PomTestsChaining extends BaseWebDriver {
  @Test
  public void test1() {
    driver.get("https://www.google.com");
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
    googleSearchPage.sendSearchQuery("It is alive!");

    Assert.assertTrue(driver.getTitle().contains("It is alive!"));
  }
}
