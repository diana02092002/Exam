package yandexmarket.project.pages;

import org.openqa.selenium.By;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

public class Cookie {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text clickToCloseCookie = new Text(By.xpath("//button[@class='button button--solid button--transparent']"), "clickToCloseCookie");
    private Browser browser = Browser.BROWSER;

    public void clickToCloseCooki(){
        clickToCloseCookie.click();
    }
}
