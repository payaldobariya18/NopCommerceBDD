package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BasePage{

    static String email = "esmaemacdonald" +timeStamp()+ "@gmail.com";

    static String password = "test1234";



    public static String timeStamp()
    {
        String timeStamp=new SimpleDateFormat("yyyymmddhhmmss").format(new java.util.Date());
        return timeStamp;
    }
    public static void clickOnElements(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text) {

        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static void selectByText(By by,String Text){
        Select selectMonth = new Select(driver.findElement(by));
        selectMonth.selectByVisibleText(Text);
    }
    public static void selectByIndex(By by,int index){

        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByIndex(index);
    }
    public static void selectByValue(By by,String value){

        Select selectDay = new Select(driver.findElement(by));
        selectDay.selectByValue(value);
    }

    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForElementToBeVisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void waitForElementToBeInvisible(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitForElementtobeDisappear(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(by)));
    }
    public static void waitUrlToBe(int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(driver.getCurrentUrl()));
    }
    public static String getCssValueFromElement(By by,String propertyName)
    {
        return driver.findElement(by).getCssValue(propertyName);
    }


























}
