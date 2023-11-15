package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{
  private By _registerLink = By.linkText("Register");
  private By _firstName = By.id("FirstName");
  private By _lastName = By.id("LastName");
  private By _date = By.name("DateOfBirthDay");
  private By _month = By.name("DateOfBirthMonth");
  private By _year = By.name("DateOfBirthYear");
  private By _email = By.id("Email");
  private By _componyName = By.id("Company");
  private By _password = By.id("Password");
  private By _confirmPassword = By.id("ConfirmPassword");
  private By _registerResult = By.id("register-button");

  static String email = "nickjonas" +timeStamp()+ "@gmail.com";

  static String password = "test1234";

 public void verifyUserOnRegisterationPage(){
    Assert.assertTrue(driver.getCurrentUrl().contains("register"),"USer on not on register page");

}
public void enterRegistrationDetails(){
     //explicit wait untill the element to be clickable
     waitForClickable((_registerLink),10);
     //enter firstname
    typeText((_firstName),"Nick");
    //enter lastname
    typeText((_lastName),"Jonas");
    //enter date
    selectByValue((_date),"9");
    //enter month
    selectByText((_month),"June");
    //enter year
    selectByText((_year),"1921");
    //enter email
    typeText((_email),email);
    //enter company name
    typeText((_componyName),"MeeraIt Consultancy");
    //enter password
    typeText((_password),password);
    //enter confirm password
    typeText((_confirmPassword),password);
    //click on register button
    clickOnElements(_registerResult);











}





}
