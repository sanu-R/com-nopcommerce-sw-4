package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By qtyClearFirst = (By.xpath("//input[@class='qty-input']"));
    By writeQty = (By.xpath("//input[@class='qty-input']"));
    By updateTheCart = (By.xpath("//button[@class='button-2 update-cart-button']"));
    By verifyTotalPrice = (By.xpath("//span[@class='product-subtotal']"));
    By agreeTermAndCondition = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By verifyShoppingMessage = (By.xpath("//h1[normalize-space()='Shopping cart']"));
    By verifyQuantity = (By.xpath("//input[@id='itemquantity11244']"));
    By verifyTotal = By.xpath("//tbody/tr[4]/td[2]/span[1]/strong[1]");
    By clickOnBox = By.xpath("//input[@id='termsofservice']");

    By lastCheckout = (By.xpath("//button[@id='checkout']"));
    By welcomeMessage = (By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));


    public void ClearTheQtyFromTheBox() {
        driver.findElement(qtyClearFirst).clear();
    }

    public void addTheTwoQty() {
        sendTextToElement(writeQty, "2");
    }

    public void updateShoppingCart() {
        clickOnElement(updateTheCart);
    }

    public void verifyTotalPriceForPc() {
        verifyText(verifyTotalPrice, "$2,950.00", "price not matched ");
    }

    public void clickOnTermAndConditionCheckbox() {
        clickOnElement(agreeTermAndCondition);
    }

    public void clickOnCheckOutButtonOnce() {
        clickOnElement(checkOut);
    }

    public void verifyShoppingCartText() {
        verifyText(verifyShoppingMessage, "", "Shopping cart text not matched ");
    }

    public void VerifyTheCartQty() {
        verifyText(verifyQuantity, "2", " Not matched ");
    }

    public void verifyTheTotal() {
        verifyText(verifyTotal, "$1,047.00", " Not matched ");
    }

    public void clickOnTeamsSquare() {
        clickOnElement(clickOnBox);
    }

    public void clickOnLastCheckOutButton() {
        clickOnElement(lastCheckout);
    }

    public void verifyWellComingText() {
        verifyText(welcomeMessage, "Welcome, Please Sign In!", "Welcome, Please Sign In text not found ");
    }


}
