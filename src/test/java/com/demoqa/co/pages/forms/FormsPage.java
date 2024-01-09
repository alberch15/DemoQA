package com.demoqa.co.pages.forms;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.mockito.internal.matchers.Find;

public class FormsPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
    protected WebElementFacade menu_forms;


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")
    protected WebElementFacade submenu_practiceform;


    @FindBy(id = "firstName")
    protected WebElementFacade txt_name;

    @FindBy(id="lastName")
    protected  WebElementFacade txt_lastname;

    @FindBy(id = "userEmail")
    protected WebElementFacade txt_email;

    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    protected WebElementFacade radiobuttom_gender;

    @FindBy(id = "userNumber")
    protected WebElementFacade txt_number;

    @FindBy(id = "dateOfBirthInput")
    protected WebElementFacade calendar;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]")
    protected WebElementFacade day;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")
    protected WebElementFacade calendar_month;

    @FindBy(xpath = "//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select")
    protected WebElementFacade calendar_year;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    protected WebElementFacade btn_sumit;

}
