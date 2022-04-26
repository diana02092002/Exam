package yandexmarket.project.pages;

import org.openqa.selenium.WebDriver;
import yandexmarket.framework.browser.Browser;
import yandexmarket.framework.browser.BrowserFactory;

public class BasePage {

    protected Browser browser;

    public BasePage(){
        this.browser = Browser.BROWSER;
    }
}
