package setUpClasses;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({ScreenShooter.class})
public class HomeworkBaseSelenideClass {
    @BeforeClass
    public void setUp () {
        Configuration.timeout = 5000;
        Configuration.reportsFolder = "reportsSelenide";
        Configuration.baseUrl = "http://demo.guru99.com/test/newtours/";
        Configuration.startMaximized = true;
    }
}
