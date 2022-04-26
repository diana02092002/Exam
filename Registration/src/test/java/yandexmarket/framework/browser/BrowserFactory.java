package yandexmarket.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import yandexmarket.Utils.ConfigFileReader;

public class BrowserFactory {
    private static ConfigFileReader configFileReader = ConfigFileReader.configFileReader;

    public static WebDriver GetDriver(String nameBrowser) {
        System.setProperty(configFileReader.getDriverAdapter(),configFileReader.getDriverPath());
        WebDriver driver;
        if (nameBrowser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (nameBrowser.equalsIgnoreCase("Firefox")) {
            driver=new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid Browser name");
        }
            return driver;
        }
}
