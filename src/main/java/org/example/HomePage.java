package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
public class HomePage extends Util{

    private By _registerButton = By.linkText("Register");


  //  public void verifyUserOnHomepage() {
   //     String expectedTitel = "Welcome to our store";
   //     String actualText1= getTextFromElement(By.xpath("//h2[text()-'Welcome to our store']"));
  //      Assert.assertEquals(actualText1,expectedTitel);
   // }



    public void ClickOnRegisterButton() {
        ClickOnElement(_registerButton, 40);
    }


}













