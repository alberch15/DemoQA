package com.demoqa.co.utils.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject demoqa;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        demoqa.setDefaultBaseUrl(url);
        demoqa.open();
    }
}
