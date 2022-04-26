package yandexmarket.project.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.framework.browser.Browser;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private ConfigFileReader configFileReader=ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    @BeforeMethod
    public void before(){
        System.setProperty(configFileReader.getDriverAdapter(),configFileReader.getDriverPath());
        browser.getDriver().manage().window().maximize();
    }
}

