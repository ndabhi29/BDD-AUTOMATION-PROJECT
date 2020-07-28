package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class RegisterPage extends Util{
LoadProp loadProp = new LoadProp();

    private By _FirstName = By.xpath("//input[@id=\"FirstName\"]");
    private By _Lastname = By.xpath("//input[@id=\"LastName\"]");
    private By _DateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _DateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _DateOfBirthYear = By.name("DateOfBirthYear");
    private By _emailId = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registerSubmitButton = By.id("register-button");



    public void UserEnterRegistrationDetails() {

        // User fill registration   details

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);// implicitlyWait for open the next button

        TypeText(_FirstName, loadProp.getProperty("FirstName"),30);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        TypeText(_Lastname, loadProp.getProperty("LastName"),40);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        selectFromDropDownByVisibleText(_DateOfBirthday, loadProp.getProperty("DateOfBirthDay"));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        selectFromDropDownByValue(_DateOfBirthMonth, loadProp.getProperty("DateOfBirthMonth"));
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        selectFromDropDownByValue(_DateOfBirthYear,loadProp.getProperty("DateOfBirthYear"));
        TypeText(_emailId,loadProp.getProperty("emailId")+timestamp()+loadProp.getProperty("Email"),20);
        //TypeText(_EmailField, loadProp.getProperty("EmailField")  + timestamp() + "DomainName",30);
        TypeText(_CompanyName, loadProp.getProperty("CompanyName"),20);
        TypeText(_Password,loadProp.getProperty("Password"),20);
        TypeText(_ConfirmPassword, loadProp.getProperty("ConfirmPassword"),20);
    }

    //  RegisterButton for cover all steps of user Registration details
    public void UserClickOnRegisterSubmitButton() {
        ClickOnElement(_registerSubmitButton, 40);


    }

    public void verifyUserIsOnRegistrationPage()
    {Assert.assertTrue(driver.getCurrentUrl().contains("_register"));
    }
}



