package com.demoqa.co.definitions;

import com.demoqa.co.steps.formsSteps.FormsStep;
import com.demoqa.co.steps.validationSteps.ValidationSteps;
import com.demoqa.co.utils.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.awt.*;

public class FormsDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    FormsStep forms;

    @Steps(shared = true)
    ValidationSteps validation;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://demoqa.com/");
    }

    @When("dirigirse al menu forms y practice form")
    public void userEnterForms(){
        forms.pathToForms();
    }

    @When("suministrar informacion personal")
    public void typePersonalInformation(){
        forms.typeUserDate("Julio", "Pachon", "juli.p@gmail.com", "3109872345");
    }

    @When("ingresar fecha de naciomiento")
    public void typeBirthDay(){
        forms.brithDate();
    }


    @When("presionar en el boton submit")
    public void clickSubmit() throws InterruptedException, AWTException {
        forms.clickSumit();
    }



    @Then("validar mensaje formulario")
   public void successfulSubmitForm(){
        Assert.assertTrue(validation.successfulTitleForms());

    }



}
