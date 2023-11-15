package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends Utils {

    //register locator
    private By _registerLink = By.cssSelector("a.ico-register");
    //computer locator
    private By _computerLink = By.xpath("//ul[@class=\"top-menu notmobile\"]//a[text()=\"Computers \"]");


    public void clickOnRegisterButton() {

        clickOnElements(_registerLink);
    }

    public void mouseHoverComputer() {

        WebElement element = driver.findElement(_computerLink);
        Actions actions = new Actions(driver);
        Action mouseOverHome = actions.moveToElement(element).build();
        mouseOverHome.perform();
    }



    public void coloroOfComputerElementAfterAction(){

       String bgColor = getCssValueFromElement((_computerLink), "color");
        System.out.println("After hover:" + bgColor);
   }
    public void clickOnDetailsButton() {
        clickOnElements(By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));


    }
}