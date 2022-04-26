package yandexmarket.project.tests;


import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.Test;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.project.pages.Authorization;
import yandexmarket.project.pages.Help;
import yandexmarket.project.pages.Registration;
import yandexmarket.project.pages.WelcomePages;

import java.awt.*;
import java.io.IOException;

public class MyTests extends BaseTest{
    Authorization authorization = new Authorization();
    Registration registration = new Registration();
    WelcomePages welcomePages = new WelcomePages();
    private ConfigFileReader config = ConfigFileReader.configFileReader;



    @Test
    public void firstTest() throws IOException, InterruptedException, AWTException {
        welcomePages.open();
        welcomePages.clickButton();

        authorization.inputPassword();
        authorization.inputEmail();
        authorization.inputDomain();
        authorization.chooseDomain();
        authorization.acceptTerms();
        authorization.goToSecond();

        registration.chooseInterest();
        registration.uploadImage();
        registration.nextButton();


    }
}
