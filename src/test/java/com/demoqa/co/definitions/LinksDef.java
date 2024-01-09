package com.demoqa.co.definitions;

import com.demoqa.co.steps.linksSteps.LinksStep;
import com.demoqa.co.steps.validationSteps.ValidationSteps;
import com.demoqa.co.utils.website.WebSite;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.awt.*;

public class LinksDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LinksStep links;

    @Steps(shared = true)
    ValidationSteps validation;


    @When("dirigirse al menu elementes y links")
    public void userEnterLinks() throws AWTException {
        links.pathToLinks();
    }

    @When("ingresar a cada link")
    public void userEnterAllLinks(){
        links.enterAllLinks();
    }


    @When("Validar informacion correcta cada link")
    public void successfullLinks(){
        Assert.assertTrue(validation.successfulTitleLinks());
    }

}
