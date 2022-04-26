package yandexmarket.framework.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import yandexmarket.Utils.ConfigFileReader;

import java.util.List;

public class Browser {

    private WebDriver driver;
    private static ConfigFileReader configFileReader = ConfigFileReader.configFileReader;
    public static Browser BROWSER = new Browser();

    private Browser() {
        this.driver = BrowserFactory.GetDriver(configFileReader.getBrowserName());
    }

    public void goTo(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
     return driver;

    }
    public WebElement findElement(By locator){
       return driver.findElement(locator);
    }
    public void quit(){
        driver.quit();
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

}



