package com.demoqa.co.steps.formsSteps;

import com.demoqa.co.pages.forms.FormsPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FormsStep extends FormsPage {

    @Step("dirigirse al menu forms y practice form")
    public void pathToForms() {
        menu_forms.isDisplayed();
        menu_forms.click();
        submenu_practiceform.isDisplayed();
        submenu_practiceform.click();

    }

    @Step("suministrar informacion personal")
    public void typeUserDate(String name, String lastName, String email, String phoneNumber) {
        txt_name.sendKeys(name);
        txt_lastname.sendKeys(lastName);
        txt_email.sendKeys(email);
        radiobuttom_gender.click();
        txt_number.sendKeys(phoneNumber);

    }

    @Step("ingresar fecha de nacimiento")
    public void brithDate() {
        calendar.click();
        Select selectM = new Select(calendar_month);
        selectM.selectByValue("10");
        Select selectY = new Select(calendar_year);
        selectY.selectByValue("1997");
        day.click();
    }

    @Step("presionar en el boton submit")
    public void clickSumit() throws AWTException {

        Robot robot = new Robot();

        // Bucle para realizar Ctrl + - varias veces


            robot.keyPress(KeyEvent.VK_CONTROL);


            robot.keyPress(KeyEvent.VK_MINUS);


            robot.keyRelease(KeyEvent.VK_CONTROL);


            robot.keyRelease(KeyEvent.VK_MINUS);

        robot.keyPress(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_MINUS);


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyRelease(KeyEvent.VK_MINUS);

        robot.keyPress(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_MINUS);


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyPress(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_MINUS);


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyRelease(KeyEvent.VK_MINUS);

        robot.keyPress(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_MINUS);


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyRelease(KeyEvent.VK_MINUS);

        robot.keyPress(KeyEvent.VK_CONTROL);


        robot.keyPress(KeyEvent.VK_MINUS);


        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.keyRelease(KeyEvent.VK_MINUS);


            btn_sumit.click();



    }
}

