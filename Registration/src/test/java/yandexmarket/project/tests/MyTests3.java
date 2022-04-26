package yandexmarket.project.tests;

import org.testng.annotations.Test;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.project.pages.Cookie;
import yandexmarket.project.pages.WelcomePages;

import java.awt.*;
import java.io.IOException;

public class MyTests3 {
    Cookie cookie = new Cookie();
    WelcomePages welcomePages = new WelcomePages();
    private ConfigFileReader config = ConfigFileReader.configFileReader;

    @Test
    public void thirdTest()  {
        welcomePages.open();
        welcomePages.clickButton();

        cookie.clickToCloseCooki();
    }
}
