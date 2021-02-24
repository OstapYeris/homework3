package testsWithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFactory.DemoPage;
import setUpClasses.BaseWebDriver;

public class homeworkTests extends BaseWebDriver {

    @Test
    public void testWithWrongCredentials() {
        driver.get("http://demo.guru99.com/test/newtours/");
        DemoPage demoPage = new DemoPage(driver);
        demoPage.setLogin("WrongLogin");
        demoPage.setPassword("WrongPassword");
        demoPage.clickSubmitButton();
        WebElement errorMessage = new WebDriverWait(driver, 4)
                .until((ExpectedConditions
                        .visibilityOfElementLocated(By
                                .xpath("//span[text()[normalize-space()='Enter your userName and password correct']]"))));
        Assert.assertEquals(errorMessage.getText(), "Enter your userName and password correct");
    }

    @Test
    public void testRegistrationProcedure() {
        driver.get("http://demo.guru99.com/test/newtours/");
        DemoPage demoPage = new DemoPage(driver);
        demoPage.redirectToRegistrationForm();
        demoPage.setUpFirstName("Ostap");
        demoPage.setUpLastName("Yerys");
        demoPage.SetPhoneFild("8888888888");
        demoPage.SetEmailFild("ostap.yeris@gmail.com");
        demoPage.SetAddressFild("Hutorivka 30");
        demoPage.SetCityFild("Lviv");
        demoPage.SetStateFild("Lviv");
        demoPage.SetPostalCodeFild("37030");
        demoPage.CheckCountryFildPresent();
        demoPage.SetUserNameFild("ostap");
        demoPage.setPassword("12345678");
        demoPage.confirmPasswordFild("12345678");
        demoPage.clickSubmitButton();
        String message = demoPage.checkSuccesfullRegistrationMessage();
        Assert.assertEquals(message, "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
//        Assert.assertEquals(demoPage.checkSuccesfullRegistrationMessage(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
//        WebElement registrationMessage = new WebDriverWait(driver, 4)
//                .until((ExpectedConditions.visibilityOfElementLocated(By
//                        .cssSelector("html>body>div:nth-of-type(2)>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(4)>td>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(3)>td>p:nth-of-type(2)>font"))));
//        Assert.assertEquals(registrationMessage
//                .getText(), "Thank you for registering. You may now sign-in using the user name and password you've just entered.");
        demoPage.clickSignOffButton();
    }

    @Test
    public void LoginWithValidCredentials() {
        driver.get("http://demo.guru99.com/test/newtours/");
        DemoPage demoPage = new DemoPage(driver);
        demoPage.setLogin("Ostap");
        demoPage.setPassword("12345678");
        demoPage.clickSubmitButton();
        WebElement loginMessage = new WebDriverWait(driver, 4)
                .until((ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Login Successfully']"))));
        Assert.assertEquals(loginMessage.getText(), "Login Successfully");
    }
}
