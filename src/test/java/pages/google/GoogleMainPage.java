package pages.google;

import googlesearchuitests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage extends BaseTest {

    WebDriver driver;

    By textInputByCss = By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input");

    String url = "http://www.google.com";

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get(url);
    }

    public void typeQuory(String quoryToType) {
        WebElement webElement = driver.findElement(textInputByCss);
        webElement.sendKeys(quoryToType);
    }

    public void submitSearch() {
        driver.findElement(textInputByCss).submit();
    }

    public void verifySuggestion() {
        //driver.findElement(textInputByCss).getAttribute()
    }
}
