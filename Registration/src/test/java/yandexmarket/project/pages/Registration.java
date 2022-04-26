package yandexmarket.project.pages;

import jdk.jshell.JShellException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import yandexmarket.element.AbstractElement;
import yandexmarket.element.Text;
import yandexmarket.framework.browser.Browser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

public class Registration {
    private Browser browser = Browser.BROWSER;
    private Text clear = new Text(By.xpath("//label[@for='interest_unselectall']"), "clear");
    private Text choose = new Text(By.xpath("//div[@class='avatar-and-interests__interests-list__item']"), "choose");
    private Text clickInsert = new Text(By.xpath("//span[@class='checkbox__box']"), "clickInsert");
    private Text upload = new Text(By.xpath("//a[@class='avatar-and-interests__upload-button']"), "upload");
    private Text next = new Text(By.xpath("//button[@name='button']"), "next");
    private Text clickToThirdPage = new Text(By.xpath("//button[@name='button']"), "goToThird");


    public void chooseInterest() {
        clear.click();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(21);
            WebElement chose = choose.findElements().get(number);
            WebElement element = clickInsert.findElements().get(number);
            element.click();
            if (chose.getText().equals("Select all")) {
                if (chose.getText().equals("Unselect all")) {
                    --i;
                } else if (chose.getText().equals("Unselect all")) {
                    --i;
                }
            } else {
                choose.findElements().get(number).click();
            }
        }
    }

    public void uploadImage() throws IOException, InterruptedException, AWTException {
        upload.click();
        Thread.sleep(5000);
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = environment.getDefaultScreenDevice();
        try {
            Robot robot = new Robot(device);
            robot.mouseMove(135, 220);
// first click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
// second click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e1) {
            e1.printStackTrace();
        }
        try {
            Robot robot = new Robot(device);
            robot.mouseMove(440, 385);
// first click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
// second click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        } catch (AWTException e1) {
            e1.printStackTrace();
        }
    }

    public void nextButton() {
        final List<WebElement> elements = next.findElements();
        for (int i = 0; i < elements.size(); i++) {
            String text = elements.get(i).getText();
            if (text.equals("Next")) {
                elements.get(i).click();
                break;
            }
        }
    }
}

