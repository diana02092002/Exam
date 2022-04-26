package yandexmarket.project.tests;

import org.testng.annotations.Test;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.project.pages.Help;
import yandexmarket.project.pages.WelcomePages;

import java.awt.*;
import java.io.IOException;

public class MyTest2 extends BaseTest {
        Help help = new Help();
        WelcomePages welcomePages = new WelcomePages();
        private ConfigFileReader config = ConfigFileReader.configFileReader;

        @Test
        public void secondTest()  {
                welcomePages.open();
                welcomePages.clickButton();
                help.clickToHelp();

        }

}
