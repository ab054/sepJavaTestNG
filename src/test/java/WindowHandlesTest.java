import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WindowHandlesTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\sepJavaTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    //TODO: automate a different scenario
    @Test
    public void test0002() {

    }

    //TODO: refactor this
    @Test
    public void test001() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement link = driver.findElement(By.linkText("Click Here"));

        String actualHrefValue = link.getAttribute("href");

        String expectedHrefValue = "https://the-internet.herokuapp.com/windows/new";

        Assert.assertEquals(actualHrefValue, expectedHrefValue);

        link.click();

        //TODO: find a better solution for number of windows wait
        Thread.sleep(5000);

        int sizeOfHandles = driver.getWindowHandles().size();

        Assert.assertEquals(sizeOfHandles, 2);


        //TODO: practice with HashSets
        String handle1 = (String) driver.getWindowHandles().toArray()[0];
        String handle2 = (String) driver.getWindowHandles().toArray()[1];

        driver.switchTo().window(handle2);

        boolean actualNewWindowTextPresented = driver.getPageSource().contains("New Window");
        boolean expectedNewWindowTextPresented = true;

        Assert.assertEquals(actualNewWindowTextPresented, expectedNewWindowTextPresented);

        driver.switchTo().window(handle1);

        link = driver.findElement(By.linkText("Click Here"));

        boolean isLinkDisplayed = link.isDisplayed();

        Assert.assertEquals(isLinkDisplayed, true);
    }

    @AfterSuite
    public void afterSuite(){
        driver.quit();
    }

}
