import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class GoogleSearchTests {

    WebDriver driver;
    String resultStatsID = "resultStats";


    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }


    @Test
    public void test0001() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\sepJavaTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");

        openBrowser();
        navigateToMainPage();
        typeQuory();
        submitSearch();
        waitForResultsElement();
        assertResultsPage();
    }

    private void waitForResultsElement() {
        By elementToWait = By.id(resultStatsID);
        ExpectedCondition condition = ExpectedConditions.presenceOfElementLocated(elementToWait);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        webDriverWait.until(condition);

        //WebElement myDynamicElement = (new WebDriverWait(driver, 10))
        //  .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));
    }

    private void assertResultsPage() {
        WebElement resultStatsElement = driver.findElement(By.id(resultStatsID));
        boolean isDisplayed = resultStatsElement.isDisplayed();
        boolean expected = true;
        Assert.assertEquals(isDisplayed, expected);
    }

    private void submitSearch() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        driver.findElement(By.cssSelector(selector)).submit();
    }

    private void typeQuory() {
        String selector = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";
        WebElement webElement = driver.findElement(By.cssSelector(selector));
        webElement.sendKeys("Portnov Computer School");
    }

    private void navigateToMainPage() {
        String url = "http://www.google.com";
        driver.get(url);
    }


    private void openBrowser() {
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
