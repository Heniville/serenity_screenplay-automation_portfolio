package com.automate_sauce.pageComponents;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("page:base_url")
public class loginPage extends PageObject {

    public static Target USERNAME_ENTRY = Target.the("user-name").located(By.name("user-name"));
    public static Target PASSWORD_ENTRY = Target.the("password").located(By.name("password"));


}
