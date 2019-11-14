package googlesearchuitests;

import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.ResultsPage;

public class GoogleSearchTests extends BaseTest {

    @Test
    public void test0001() {
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        ResultsPage resultsPage = new ResultsPage(driver);

        mainPage.navigate();
        mainPage.typeQuory("Portnov School");
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
