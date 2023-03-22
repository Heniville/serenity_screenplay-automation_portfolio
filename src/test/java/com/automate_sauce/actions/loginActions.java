package com.automate_sauce.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class loginActions {

    public static Performable enterStandardUserNameAndPassword() {
        return Task.where(
                "{0} enter a valid username and password combination"


    }
}
