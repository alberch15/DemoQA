package com.demoqa.co.steps.slideSteps;

import com.demoqa.co.pages.slidePage.SlidePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.awt.*;
import java.awt.event.InputEvent;

public class SlideSteps extends SlidePage {
    public void pathSlide() {
        menu_widgets.isDisplayed();
        menu_widgets.click();
        submenu_slide.isDisplayed();
        submenu_slide.click();
    }

    public void moveSlide() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(500, 500);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(600, 500);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


    }



}
