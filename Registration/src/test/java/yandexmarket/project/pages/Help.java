package yandexmarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.List;

public class Help {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text clickToHelp = new Text(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "clickToHelp");
    private Browser browser = Browser.BROWSER;
    private  Text hiddenForm = new Text (By.xpath("//div[@class='help-form is-hidden']"), "hiddenForm");

   public void clickToHelp(){
       clickToHelp.click();
   }
}
