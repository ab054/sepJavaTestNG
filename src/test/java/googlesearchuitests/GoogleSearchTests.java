package googlesearchuitests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.ResultsPage;

public class GoogleSearchTests extends BaseTest {

    @DataProvider(name = "dataForGoogleTest")
    public Object[][] createData1() {
        return new Object[][] {
                { "Portnov Computer School" },
                { "frewf43rt14331412342134#@#@#@$@" },
        };
    }


    @Test(dataProvider = "dataForGoogleTest")
    public void test0001(String queryToType) {
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);

        mainPage.navigate();
        mainPage.typeQuory(queryToType);
        mainPage.submitSearch();
        resultsPage.waitForResultsElement();
        resultsPage.assertResultsPage();
    }

    @Test
    public void test0002() {
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);

        mainPage.navigate();
        mainPage.typeQuory("Portnov School");
        mainPage.verifySuggestion();
        mainPage.submitSearch();
        resultsPage.waitForResultsElement();
        resultsPage.assertResultsPage();
    }
}
