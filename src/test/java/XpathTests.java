import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class XpathTests {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\barab\\IdeaProjects\\sepJavaTestNG\\src\\test\\resources\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }



    @Test
    public void test0001() {
        driver.get("https://the-internet.herokuapp.com/login");

        String absXpath = "html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]";

        String relativeXpath = "//form/div[1]/div/div[1]/div/div/input[1]";


        String fullXpath = "/html/body/div[2]/div/div/form/div[1]/div/input";
        String xpath0 = "//*[@id=\"username\"]";

        String xpath1 = "//input[@name='username']";
        String xpath2 = "//input[@name='username'][@type='text']";
        String xpath3 = "//input[@name='username' and @type='text']";
        String xpath4 = "//input[@name='username' or @type='text']";
        String xpath5 = "//*[contains(@class,'columns')]";
        String xpath6 = "//*[starts-with(@class,'large')]";
        String xpath7 = "//*[text()=' Login']";

        String xpath8 = "(//input[@type='text'])[last()]";
        String xpath9 = "(//input[@type='text'])[1]";

        String xpath10 = "//*[@id='FirstName']/following::input[@type='text']";
        String xpath11 = "//*[@id='LastName']//preceding::input[@type='text']";

        driver.findElement(By.xpath(xpath6));
    }
}
