package com.demoqa.co.definitions;

import com.demoqa.co.steps.formsSteps.FormsStep;
import com.demoqa.co.steps.slideSteps.SlideSteps;
import com.demoqa.co.steps.validationSteps.ValidationSteps;
import com.demoqa.co.utils.website.WebSite;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.awt.*;

public class SlideDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    SlideSteps slide;

    @Steps(shared = true)
    ValidationSteps validation;

    @When("dirigirse al menu widget y slide")
    public void userEnterSlide(){
        slide.pathSlide();
    }


    @When("manipular slide hasta llegar a 3")
    public void moveSlide() throws AWTException {
        slide.moveSlide();

    }

    @Then("Validar si esta en 3")
    public void successfulMoveSlide(){
        Assert.assertTrue(validation.successfulTSlide());

    }


}
