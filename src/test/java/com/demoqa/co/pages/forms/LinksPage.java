package com.demoqa.co.pages.forms;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LinksPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
    protected WebElementFacade menu_elemets;

    @FindBy(xpath = "//*[@id=\"item-5\"]")
    protected WebElementFacade submenu_links;

    @FindBy(id = "simpleLink")
    protected WebElementFacade lbl_home;

    @FindBy(id = "dynamicLink")
    protected WebElementFacade lbl_homedn;


    @FindBy(id = "created")
    protected WebElementFacade lbl_created;

    @FindBy(id = "no-content")
    protected WebElementFacade lbl_nocontent;


    @FindBy(id = "moved")
    protected WebElementFacade lbl_moved;


    @FindBy(id = "bad-request")
    protected WebElementFacade lbl_badrequest;

    @FindBy(id = "unauthorized")
    protected WebElementFacade lbl_unauthorized;

    @FindBy(id = "invalid-url")
    protected WebElementFacade lbl_invalidurl;


}
