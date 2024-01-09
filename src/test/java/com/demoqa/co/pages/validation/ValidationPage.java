package com.demoqa.co.pages.validation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(id = "example-modal-sizes-title-lg")
    protected WebElementFacade lbl_successfulmessage;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/a/img")
    protected WebElementFacade img_index;

    @FindBy(xpath = "//*[@id=\"linkResponse\"]/b[1]")
    protected WebElementFacade lbl_request;


    @FindBy(xpath = "//*[@id=\"sliderValue\"]")
    protected WebElementFacade lbl_numberslide;

}
