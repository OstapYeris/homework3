package SelenideIntro;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchPageSelenide;
import pages.ResultsPageSelenide;
import setUpClasses.BaseSelenideClass;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SelenideIntro extends BaseSelenideClass {
    @Test
    public void test1() {
        open("/");
        new GoogleSearchPageSelenide().sendSearchQuery("Selenide").pressSearch();
        ResultsPageSelenide reresultsPage = new ResultsPageSelenide();

        int numOfResults = reresultsPage.getResults().size();
//        reresultsPage.getResults().shouldBe(CollectionCondition.sizeGreaterThan(0));
        Assert.assertNotEquals(numOfResults, 0);

        reresultsPage.clickGitHubLink();
//        WebDriverRunner.url();
        String currentURL = WebDriverRunner.url();
        Assert.assertEquals(currentURL, "https://github.com/selenide/selenide/blob/master/README.md");
    }
}
