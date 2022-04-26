package yandexmarket.project.tests;

import org.testng.annotations.Test;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.project.pages.Taimer;
import yandexmarket.project.pages.WelcomePages;

public class MyTests4 {
    Taimer taimer = new Taimer();
    WelcomePages welcomePages = new WelcomePages();
    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @Test
    public void thirdTest() {
        welcomePages.open();
        welcomePages.clickButton();
        taimer.ClickToTaimer();
    }
}
