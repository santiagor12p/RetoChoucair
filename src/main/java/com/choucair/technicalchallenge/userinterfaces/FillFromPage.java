package com.choucair.technicalchallenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class FillFromPage {
    public static final Target NAMES = Target.the("Name").locatedBy("//input[@id='firstName']");
    public static final Target LAST_NAMES = Target.the("lastName").locatedBy("//input[@id='lastName']");
    public static final Target EMAIL_ADDRESS = Target.the("Email Address").locatedBy("//input[@id='email']");
    public static final Target BIRTH_MONTH = Target.the("Birth Month").locatedBy("//select[@aria-label='Birth month']");
    public static final Target BIRTH_DAY = Target.the("Birth Day").locatedBy("//select[@aria-label='Birth day']");
    public static final Target BIRTH_YEAR = Target.the("Birth Year").locatedBy("//select[@aria-label='Birth year']");
    public static final Target LANGUAGES =Target.the("Languages").locatedBy("//input[@aria-label='Select box']");
    public static final Target NEXT =Target.the("Next").locatedBy("//a[@aria-label='Next step - define your location']");
}
