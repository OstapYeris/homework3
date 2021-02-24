package SelenideIntro;

import org.openqa.selenium.By;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;
import setUpClasses.BaseSelenideClass;
import setUpClasses.HomeworkBaseSelenideClass;
import pages.DemoPageSelenide;
import static com.codeborne.selenide.Selenide.*;

public class selenideIntroTestsHomework extends HomeworkBaseSelenideClass {
    @Test
    public void loginWithWrongCredentials() {
        open("");
        new DemoPageSelenide().LoginFieldSet("WrongLogin");
        new DemoPageSelenide().PasswordFieldSet("WrongPassword");
        new DemoPageSelenide().pressSubmitButton();
        new DemoPageSelenide().wrongCredentialsMessage();
    }
    @Test
    public void testRegistrationProcedure() {
        open("");
        new DemoPageSelenide().setUpRegistrationForm("Ostap", "Yeris", "80699889998",
                "ostap.yeris@gmail.com", "Hutorivka 30", "Lviv", "Lviv", "37030",
                "ostap", "12345678", "12345678");
        new DemoPageSelenide().pressSubmitButton();
        new DemoPageSelenide().RegistrationMessage();
        new DemoPageSelenide().signOff();
    }
    @Test
    public void loginWithValidCredentials() {
        open("");
        new DemoPageSelenide().LoginFieldSet("ostap");
        new DemoPageSelenide().PasswordFieldSet("12345678");
        new DemoPageSelenide().pressSubmitButton();
        new DemoPageSelenide().successfullLoginMessage();
    }
}
