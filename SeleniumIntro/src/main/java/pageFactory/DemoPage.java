package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoPage {
    WebDriver driver;

    By loginField = By.name("userName");
    By passwordField = By.name("password");
    By submitButton = By.name("submit");
    By registrationButton = By.xpath("//a[@href='register.php']");
    By firstNameField = By.name("firstName");
    By lastNameField = By.name("lastName");
    By phoneFild = By.name("phone");
    By emailFild = By.xpath("//input[@id='userName']");
    By addressFild = By.name("address1");
    By cityFild = By.name("city");
    By stateFild = By.name("state");
    By postalCodeFild = By.name("postalCode");
    By countryFild = By.name("country");
    By userNameFild = By.name("email");
    By confirmPasswordFild = By.name("confirmPassword");
    By SignOffButton = By.xpath("(//a[@href='index.php'])[3]");
    By successfullRegistrationMessage = By.cssSelector("html>body>div:nth-of-type(2)>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(4)>td>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(3)>td>p:nth-of-type(2)>font");
    By wrongLoginMessage = By.xpath("//span[text()[normalize-space()='Enter your userName and password correct']]");

    public DemoPage (WebDriver webDriver) {
        this.driver = webDriver;

        if (!driver.getTitle().equals("Welcome: Mercury Tours")) {
            throw new IllegalStateException(
                    "This is not Google search page," + " current page is: " + driver.getCurrentUrl());
        }
    }

    public void setLogin (String Login) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(loginField).sendKeys(Login);
    }

    public void setPassword (String Password) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickSubmitButton () {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton)).click();
    }

    public void redirectToRegistrationForm () {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(registrationButton)).click();
    }

    public void setUpFirstName (String FirstName) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(firstNameField).sendKeys(FirstName);
    }

    public void setUpLastName (String LastName) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(lastNameField).sendKeys(LastName);
    }

    public void SetPhoneFild (String Phone) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(phoneFild).sendKeys(Phone);
    }

    public void SetEmailFild (String Email) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(emailFild).sendKeys(Email);
    }

    public void SetAddressFild (String Address) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(addressFild).sendKeys(Address);
    }

    public void SetCityFild (String city) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(cityFild).sendKeys(city);
    }

    public void SetStateFild (String state) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(stateFild).sendKeys(state);
    }

    public void SetPostalCodeFild (String PostalCode) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(postalCodeFild).sendKeys(PostalCode);
    }

    public void CheckCountryFildPresent () {
        driver.findElement(countryFild).isDisplayed();
    }

    public void SetUserNameFild (String UserName) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(userNameFild).sendKeys(UserName);
    }

    public void confirmPasswordFild (String Password) {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(submitButton));
        driver.findElement(confirmPasswordFild).sendKeys(Password);
    }

//    public void checkSuccesfullRegistrationMessage () {
//        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(successfullRegistrationMessage));
//        driver.findElement(successfullRegistrationMessage).getText();
//    }
//
//    public void CheckLoginWithWrongCredentialsMessage () {
//        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(wrongLoginMessage));
//        driver.findElement(wrongLoginMessage).getText();
//    }

    public void clickSignOffButton () {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(SignOffButton)).click();
    }
}
