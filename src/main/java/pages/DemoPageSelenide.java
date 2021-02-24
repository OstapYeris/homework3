package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class DemoPageSelenide {
        SelenideElement loginField = $(By.name("userName"));
        SelenideElement passwordField = $(By.name("password"));
        SelenideElement submitButton = $(By.name("submit"));
        SelenideElement registrationButton = $x("//a[@href='register.php']");
        SelenideElement firstNameField = $(By.name("firstName"));
        SelenideElement lastNameField = $(By.name("lastName"));
        SelenideElement phoneFild = $(By.name("phone"));
        SelenideElement emailFild = $x("//input[@id='userName']");
        SelenideElement addressFild = $(By.name("address1"));
        SelenideElement cityFild = $(By.name("city"));
        SelenideElement stateFild = $(By.name("state"));
        SelenideElement postalCodeFild = $(By.name("postalCode"));
        SelenideElement countryFild = $(By.name("country"));
        SelenideElement userNameFild = $(By.name("email"));
        SelenideElement confirmPasswordFild = $(By.name("confirmPassword"));
        SelenideElement SignOffButton = $x("(//a[@href='index.php'])[3]");
        SelenideElement successfullRegistrationMessage = $(By.cssSelector("html>body>div:nth-of-type(2)>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(4)>td>table>tbody>tr>td:nth-of-type(2)>table>tbody>tr:nth-of-type(3)>td>p:nth-of-type(2)>font"));
        SelenideElement wrongCredentialsMessage = $x("//span[text()[normalize-space()='Enter your userName and password correct']]");
        SelenideElement successfullLoginMessage = $x("//h3[text()='Login Successfully']");

    public DemoPageSelenide LoginFieldSet(String query) {
        loginField.shouldBe(visible).sendKeys(query);
        return this;
    }
    public DemoPageSelenide PasswordFieldSet(String query) {
        passwordField.shouldBe(visible).sendKeys(query);
        return this;
    }
    public DemoPageSelenide pressSubmitButton() {
        submitButton.click();
        return this;
    }
    public DemoPageSelenide signOff() {
        SignOffButton.click();
        return this;
    }
    public DemoPageSelenide wrongCredentialsMessage() {
        wrongCredentialsMessage.shouldHave(text("Enter your userName and password correct"));
        return this;
    }
    public DemoPageSelenide successfullLoginMessage() {
        successfullLoginMessage.shouldHave(text("Login Successfully"));
        return this;
    }
    public DemoPageSelenide RegistrationMessage() {
        successfullRegistrationMessage.shouldHave(text("Thank you for registering. You may now sign-in using the user name and password you've just entered."));
        return this;
    }
    public DemoPageSelenide setUpRegistrationForm(String query, String lastName, String phone, String email, String address,
                                                  String city, String state, String postalCode, String userName, String password,
                                                  String ConfirmPassword)
    {
        registrationButton.click();
        firstNameField.sendKeys(query);
        lastNameField.sendKeys(lastName);
        phoneFild.sendKeys(phone);
        emailFild.sendKeys(email);
        addressFild.sendKeys(address);
        cityFild.sendKeys(city);
        stateFild.sendKeys(state);
        postalCodeFild.sendKeys(postalCode);
        countryFild.shouldBe(visible);
        userNameFild.sendKeys(userName);
        passwordField.sendKeys(password);
        confirmPasswordFild.sendKeys(ConfirmPassword);
        return this;
    }
}
