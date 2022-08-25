package com.choucair.technicalchallenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class GoToRegisterModulePage {
    public static final Target GO_TO_REGISTER = Target.the("Sign Up")
            .locatedBy("//a[@ui-sref='signup.personal']");

}
