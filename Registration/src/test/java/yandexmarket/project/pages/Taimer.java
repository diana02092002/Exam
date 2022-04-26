package yandexmarket.project.pages;

import org.openqa.selenium.By;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

public class Taimer {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text clickToTaimer = new Text(By.xpath("//div[@class='timer timer--white timer--center']"), "clickToTaimer");
    private Browser browser = Browser.BROWSER;

    public void ClickToTaimer (){
        clickToTaimer.getText();
        System.out.println(clickToTaimer.getText());

    }
}
