package yandexmarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

public class WelcomePages extends BasePage{

    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Browser browser = Browser.BROWSER;
    private Text clickToButton = new Text(By.xpath("//a[@class='start__link']"), "clickToButtonHERE");

    public void open() {
        browser.goTo(config.getApplicationUrl());
    }
    public void clickButton() {
        clickToButton.click();
    }
    }


