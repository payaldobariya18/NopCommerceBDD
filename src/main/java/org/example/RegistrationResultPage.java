package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils{
    private static By _RegisteredConfirm = By.xpath("//div[@class=\"result\"]");
    static String expectedRegistrationSuccessMessage = "Your registration completed";

 public void verifyUserRegisrationSuccessfully(){
     //verify user registered successfully
     String actualRegistrationSuccessMessage = getTextFromElement(_RegisteredConfirm);
     Assert.assertEquals(actualRegistrationSuccessMessage,expectedRegistrationSuccessMessage,"not register");
 }
 }
