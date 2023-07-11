package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourComputerPage extends Utility {
    By verifyBuildYourOwn = (By.xpath("//h1[contains(text(),'Build your own computer')]"));
    By selectDualCore = (By.xpath("//select[@id='product_attribute_1']"));
    By gbSelect = (By.xpath("//select[@id='product_attribute_2']"));
    By hhdRadio = (By.xpath("//input[@id='product_attribute_3_7']"));
    By osRadio = (By.xpath("//label[text()='Vista Premium [+$60.00]']"));
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = (By.xpath("//span[@id='price-value-1']"));
    By addCart = (By.xpath("//button[@id='add-to-cart-button-1']"));
    By verifyProductAdded = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeTheSquare = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseOnShopping = (By.xpath("//span[contains(text(),'Shopping cart')]"));
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By verifyTheMessage = (By.xpath("//h1[contains(text(),'Shopping cart')]"));

    public void verifyTheTextBuildYourOwnComputer() {
        verifyText(verifyBuildYourOwn, "Build your own computer", "Build your own computer text not found");
    }

    public void selectDualCorePentiumE() {
        selectByVisibleTextFromDropDown(selectDualCore, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    public void selectGbFromEight() {
        selectByVisibleTextFromDropDown(gbSelect, "8GB [+$60.00]");
    }

    public void clickHhdRadio() {
        clickOnElement(hhdRadio);
    }

    public void clickOsRadio() {
        clickOnElement(osRadio);
    }

    public void clickOnTotalCommander() {
        clickOnElement(totalCommander);
    }

    public void verifyThePriceForBuildYour() {
        verifyText(verifyPrice, "$1,475.00", "Price not found");
    }

    public void addToCartButton() {
        clickOnElement(addCart);
    }

    public void verifyTheProductHasBeenAddedToYourCart() {
        getTextFromElement(verifyProductAdded);
    }

    public void closeTheSquareButtonOnRight() {
        clickOnElement(closeTheSquare);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElement(mouseOnShopping);
    }

    public void goToCartButtonClick() {
        clickOnElement(goToCart);
    }

    public void verifyTheMessageShoppingCartOne() {
        verifyText(verifyTheMessage, "Shopping cart", "Shopping cart text not found");
    }


}
