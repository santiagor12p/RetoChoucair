package com.choucair.technicalchallenge.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/register_user_in_utest.feature",
    glue = "com.choucair.technicalchallenge.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)
public class UserRegister {

}
