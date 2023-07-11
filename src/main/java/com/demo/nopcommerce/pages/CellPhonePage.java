package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By textLumia = (By.xpath("//h1[contains(text()='Nokia Lumia 1020')]"));
    By priceVerify = (By.xpath("//span[@id='price-value-20']"));
    By changeQuan = (By.xpath("//input[@id='product_enteredQuantity_20']"));
    By enterNewQty = (By.xpath("//input[@id='product_enteredQuantity_20']"));

    By addToCart = (By.xpath("//button[@id='add-to-cart-button-20']"));
    By verifyMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By clickOnCross = By.xpath("//span[@title='Close']");
    By mouseOnCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    By clickGoTo = By.xpath("//button[normalize-space()='Go to cart']");


    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020() {
        clickOnElement(nokiaLumia1020);
    }

    public void verifyTheNameLumia() {
        verifyText(textLumia, "Nokia Lumia 1020", "Nokia Lumia 1020 not found");
    }

    public void verifyThePriceLumia() {
        verifyText(priceVerify, "$349.00", "Price not found");
    }

    public void clearTheQuantity() {
        driver.findElement(changeQuan).clear();
    }

    public void enterNewTheQuantity() {
        sendTextToElement(enterNewQty, "2");

    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);

    }

    public void verifyTheProductHasBeenAdded() {
        verifyText(verifyMessage, "The product has been added to your shopping cart", "The product has been added to your shopping cart text not found");
    }

    public void clickOnCrossSquare() {
        clickOnElement(clickOnCross);

    }

    public void mouseHoverOnCartTop() {
        mouseHoverToElement(mouseOnCart);

    }

    public void clickOnGoToCartRectangle() {
        clickOnElement(clickGoTo);


    }


}