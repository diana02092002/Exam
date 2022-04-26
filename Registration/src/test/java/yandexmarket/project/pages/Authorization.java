package yandexmarket.project.pages;

import org.openqa.selenium.By;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Authorization  {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text password = new Text(By.xpath("//input[@placeholder='Choose Password']"), "password");
    private Text email = new Text(By.xpath("//input[@placeholder='Your email']"), "email");
    private Text domain = new Text(By.xpath("//input[@placeholder='Domain']"), "domain");
    private Text clickToSecondPage = new Text(By.xpath("//a[@class='button--secondary']"), "clickToSecond");
    private Text domainClick = new Text(By.xpath("//div[@class='dropdown__field']"), "domainClick");
    private Text domainDrop = new Text(By.xpath("//div[@class='dropdown__list-item']"), "domainDrop");
    private Text clickAccept = new Text(By.xpath("//span[@class='checkbox']"), "clickAccept");
    private Browser browser = Browser.BROWSER;

    public void inputPassword() {
        password.clear();
        password.sendKeys(config.getPassword());
    }

    public void inputEmail() {
        email.clear();
        email.sendKeys(config.getEmail());
    }

    public void inputDomain() {
        domain.clear();
        domain.sendKeys(config.getDomain());
    }

    public void acceptTerms() {
        clickAccept.click();
    }

    public void goToSecond() {
        clickToSecondPage.click();
    }

    public void chooseDomain() {
        domainClick.click();
        Random random = new Random();
        for (int i = 0; i < 1; i++) {
            int item = random.nextInt(11);
            if(domainDrop.findElements().get(item).getText().equals("other")){
                i--;
                continue;
            }else domainDrop.findElements().get(item).click();
        }
        browser.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    }



