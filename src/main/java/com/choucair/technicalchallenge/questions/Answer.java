package com.choucair.technicalchallenge.questions;

import com.choucair.technicalchallenge.userinterfaces.FillFromPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private final String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question){
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Final_message = Text.of(FillFromPassword.WELCOME_MESSAGE).viewedBy(actor).asString();
        if (question.equals(Final_message)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
