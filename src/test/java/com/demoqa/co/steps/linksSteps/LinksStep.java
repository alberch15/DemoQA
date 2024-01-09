package com.demoqa.co.steps.linksSteps;

import com.demoqa.co.pages.forms.LinksPage;
import net.thucydides.core.annotations.Step;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LinksStep extends LinksPage {

    @Step("dirigirse al menu elementes y links")
    public void pathToLinks() throws AWTException {
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
        menu_elemets.isDisplayed();
        menu_elemets.click();
        submenu_links.isDisplayed();
        submenu_links.click();

    }

    @Step("ingresar a cada link")
    public void enterAllLinks() {
        lbl_home.isDisplayed();
        lbl_home.click();
        lbl_homedn.isDisplayed();
        lbl_homedn.click();
        lbl_created.isDisplayed();
        lbl_created.click();
        lbl_nocontent.isDisplayed();
        lbl_nocontent.click();
        lbl_badrequest.isDisplayed();
        lbl_badrequest.click();
        lbl_unauthorized.isDisplayed();
        lbl_unauthorized.click();
        lbl_invalidurl.isDisplayed();
        lbl_invalidurl.click();


    }
}
