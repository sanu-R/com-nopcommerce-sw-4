package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By verifyWelcomeText = (By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
    By guest = (By.xpath("//button[contains(text(),'Checkout as Guest')]"));
    By firstName = (By.xpath("//input[@id='BillingNewAddress_FirstName']"));
    By lastName = (By.xpath("//input[@id='BillingNewAddress_LastName']"));
    By email = (By.xpath("//input[@id='BillingNewAddress_Email']"));
    By countryDropdown = By.id("//select[@id='BillingNewAddress_CountryId']");
    By cityBox = By.id("BillingNewAddress_City");
    By address1Box = By.id("BillingNewAddress_Address1");
    By postalCodeBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = (By.xpath("//div[@id='billing-buttons-container']//button[text()='Continue']"));
    By clickOnReg = (By.xpath("//button[contains(text(),'Register')]"));

    By checkRegister = (By.xpath("//h1[contains(text(),'Register')]"));
    By fName = (By.xpath("//input[@id='FirstName']"));
    By lName = (By.xpath("//input[@id='LastName']"));

    By mail = (By.xpath("//input[@id='Email']"));
    By rPassword = (By.xpath("//input[@id='Password']"));
    By cPassword = (By.xpath("//input[@id='ConfirmPassword']"));
    By pressRegButton = (By.xpath("//button[@id='register-button']"));
    By regComplete = (By.xpath("//div[contains(text(),'Your registration completed')]"));


    public void verifyWelcomeMessage() {
        verifyText(verifyWelcomeText, "Welcome, Please Sign In!", "Welcome, Please Sign In! text not found");
    }

    public void checkOutAsGuestClick() {
        clickOnElement(guest);
    }

    public void enterTheFirstName() {
        sendTextToElement(firstName, "Rita");
    }

    public void enterTheLastName() {
        sendTextToElement(lastName, "Raja");
    }

    public void enterTheEmail() {
        sendTextToElement(email, "rajar123@gmail.com");
    }

    public void countryDropdownSelect() {
        selectByVisibleTextFromDropDown(countryDropdown, "United Kingdom");
    }

    public void enterTheCityName() {
        sendTextToElement(cityBox, "London");
    }

    public void enterTheAddressFirstLine() {
        sendTextToElement(address1Box, "10 downing street");
    }

    public void enterPostalCode() {
        sendTextToElement(postalCodeBox, "SW1A 2AA");
    }

    public void enterThePhoneNumber() {
        sendTextToElement(phoneNumberBox, "09876543212");
    }

    public void clickOnContinueBlueBox() {
        clickOnElement(continueButton);
    }

    public void clickOnBlueRegister() {
        clickOnElement(clickOnReg);
    }

    public void checkRegisterText() {
        verifyText(checkRegister, "Register", "Register text not found");
    }

    public void enterYourFirstName() {
        sendTextToElement(fName, "Rima");
    }

    public void enterYourLastNameToField() {
        sendTextToElement(lName, "Rao");
    }

    public void enterYourEmailToEmailField() {
        sendTextToElement(mail, "rao1234@gmail.com");
    }

    public void writeYourPassword() {
        sendTextToElement(rPassword, "really123");
    }

    public void rewriteYourPasswordToPasswordField() {
        sendTextToElement(cPassword, "really123");
    }

    public void pressLastRegisterField() {
        clickOnElement(pressRegButton);
    }

    public void yourRegHasCompleted() {
        verifyText(regComplete, "Your registration completed", "Your registration completed text not found");
    }

}
