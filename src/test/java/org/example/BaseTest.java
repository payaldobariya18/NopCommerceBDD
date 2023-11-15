package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowserManeger{

  @BeforeMethod
  public void setup()
  {
    OpenBrowser();

  }
  @AfterMethod
  public void tearDown()
  {
      closeBrowser();
  }







}
