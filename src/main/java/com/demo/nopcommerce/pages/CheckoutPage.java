package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By deliveryRound = (By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']"));
    By enterCon = (By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    By payCard = (By.xpath("//input[@id='paymentmethod_1']"));

    By selectMasterCard = (By.xpath("//select[@id='CreditCardType']"));
    By cardHolderName = (By.xpath("//input[@id='CardholderName']"));
    By cardHolderNumber = (By.xpath("//input[@id='CardNumber']"));

    By cardExpire = By.xpath("//select[@id='ExpireMonth']");
    By expireYear = (By.xpath("//select[@id='ExpireYear']"));
    By continueNext = (By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']"));
    By verifyPayment = (By.xpath("//span[contains(text(),'Credit Card')]"));

    By shipping = By.xpath("//li[@class='shipping-method']/span[@class='value']");
    By verifyTotal = (By.xpath("//span[@class='value-summary']//strong[text()='$2,950.00']"));
    By clickOnCon = (By.xpath("//button[contains(text(),'Confirm')]"));
    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifySuccessfulOder = (By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
    By pressCon = (By.xpath("//button[contains(text(),'Continue')]"));
    By ourStore = (By.xpath("//h2[contains(text(),'Welcome to our store')]"));

    public void clickOnRadioButtonNextDay() {
        clickOnElement(deliveryRound);
    }

    public void enterOnContinue() {
        clickOnElement(enterCon);
    }

    public void selectCardRadioButton() {
        clickOnElement(payCard);
    }

    public void selectMasterCardOption() {
        selectByValueFromDropDown(selectMasterCard, "Master card");

    }

    public void enterCardHolderNameIn() {
        sendTextToElement(cardHolderName, "Rita");
    }

    public void enterCardHolderNumber() {
        sendTextToElement(cardHolderNumber, "5425233430109903");
    }

    public void enterCardExpireMonth() {
        selectByValueFromDropDown(cardExpire, "11");
    }


    public void enterCardExpireYear() {
        selectByValueFromDropDown(expireYear, "2025");
    }

    public void clickContinueForGoing() {
        clickOnElement(continueNext);
    }

    public void verifyPaymentMethod() {
        verifyText(verifyPayment, "Credit Card", "card text not found");

    }

    public void verifyShippingMethod() {
        verifyText(shipping, "Next Day Air", "Next Day Air text not found");

    }

    public void verifyTotalCost() {
        verifyText(verifyTotal, "$2,950.00", "Price not found");
    }

    public void clickOnConfirmOder() {
        clickOnElement(clickOnCon);
    }

    public void verifyThankYouText() {
        verifyText(thankYou, "Thank You", "Thank You text not found");
    }


    public void verifyOderIsSuccessfullyProcessed() {
        verifyText(verifySuccessfulOder, "Your order has been successfully processed!", "Oder is not successful");
    }

    public void pressOnCon() {
        clickOnElement(pressCon);
    }

    public void verifyWelcomeToOurStore() {
        verifyText(ourStore, "Welcome to our store", "Welcome to our store text not found");
    }


}
