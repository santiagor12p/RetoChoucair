package com.choucair.technicalchallenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFromPassword {

    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='password']");
    public static final Target CONFIRM_PASSWORD = Target.the("Confirm Password").locatedBy("//input[@id='confirmPassword']");
    public static final Target STAY_INFORMED = Target.the("Stay Informed").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target ACCEPT_TERMS = Target.the("Accept Terms").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_PRIVACY = Target.the("Accept Privacy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP = Target.the("Complete Setup").locatedBy("//a[@aria-label='Complete Setup']");
    public static final Target WELCOME_MESSAGE = Target.the("Welcome message").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));
}
