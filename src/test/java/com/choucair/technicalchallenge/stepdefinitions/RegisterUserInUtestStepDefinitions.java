package com.choucair.technicalchallenge.stepdefinitions;

import com.choucair.technicalchallenge.tasks.FillOutUserForm;
import com.choucair.technicalchallenge.tasks.GoToRegisterModule;
import com.choucair.technicalchallenge.tasks.OpenTheBrowser;
import com.choucair.technicalchallenge.userinterfaces.InitialPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegisterUserInUtestStepDefinitions {
private InitialPage page;

    @Before
    public void setUp() { setTheStage(new OnlineCast()); }
    @Given("^(.*) is on the utest page$")
    public void theUserIsOnTheUtestPage(String name) {
        theActorCalled(name).wasAbleTo(OpenTheBrowser.on(page));
    }

    @Given("^go to the register module$")
    public void goToTheRegisterModule() {
        theActorInTheSpotlight().attemptsTo(GoToRegisterModule.usRegister());
    }

    @When("^enter his dates in the module$")
    public void enterHisDatesInTheModule() {
        theActorInTheSpotlight().attemptsTo(FillOutUserForm.whitDates());
    }

    @Then("^shoul see the welcome message$")
    public void shoulSeeTheWelcomeMessage() {
    }



}
