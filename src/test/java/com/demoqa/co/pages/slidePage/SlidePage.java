package com.demoqa.co.pages.slidePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SlidePage extends PageObject {
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[4]")
    protected WebElementFacade menu_widgets;

    @FindBy(xpath = "//*[@id=\"item-3\"]")
    protected WebElementFacade submenu_slide;

    @FindBy(xpath = "//*[@id=\"sliderContainer\"]/div[1]/span/input")
    protected WebElementFacade slide;
}
