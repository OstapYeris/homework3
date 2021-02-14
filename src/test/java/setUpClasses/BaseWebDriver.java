package setUpClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseWebDriver {
  protected WebDriver driver;

  @BeforeClass
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "/home/ostap/Documents/logos/AQA course/webDriver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
