package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Common;

public class ResultsPage {

    private WebDriver driver;

    String resultStatsID = "resultStats";

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForResultsElement() {
        Common.waitForElementById(driver, resultStatsID);
    }

    public void assertResultsPage() {
        WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));
        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(isDisplayed, expected);
    }

}
