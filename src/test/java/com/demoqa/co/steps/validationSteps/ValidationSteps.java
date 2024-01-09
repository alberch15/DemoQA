package com.demoqa.co.steps.validationSteps;

import com.demoqa.co.pages.validation.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationSteps extends ValidationPage {

    @Step("validar mensaje formulario")
    public boolean successfulTitleForms(){
        return lbl_successfulmessage.isDisplayed();

    }

    @Step("Validar informacion correcta cada link")
    public boolean successfulTitleLinks(){
        return lbl_request.isDisplayed();

    }

    @Step("Validar si esta en 3")
    public boolean successfulTSlide(){
        return lbl_request.isDisplayed();

    }
}
