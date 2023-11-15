package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserManeger extends Utils{


    public void OpenBrowser(){
        System.setProperty("WebDriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        //setting for chrome browser run
        driver = new ChromeDriver();
        //implicity wait for each command
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //maximize full web screen
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.nopcommerce.com/");
        }
    public void closeBrowser(){

        driver.quit();
    }





}
