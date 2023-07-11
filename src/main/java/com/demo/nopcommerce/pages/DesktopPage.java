package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By desktop = By.xpath("//img[@alt='Picture for category Desktops']");
    By sortZToA = (By.xpath("//select[@id='products-orderby']"));
    By verifySort = (By.xpath("//option[contains(text(),'Name: Z to A')]"));
    By selectAto = (By.xpath("//select[@id='products-orderby']"));
    By addTo = By.xpath("//div[@class='buttons']//button[text()='Add to cart']");

    public void clickOnDesktop() {
        clickOnElement(desktop);
    }

    public void sortPosition() {
        selectByVisibleTextFromDropDown(sortZToA, "Name: Z to A");
    }

    public void verifySortIsArrangeInDescendingOrder() {
        getTextFromElement(verifySort);
    }

    public void selectSortByAToZ() {
        selectByVisibleTextFromDropDown(selectAto, "Name: A to Z");
    }

    public void clickOnAddToCart() {
        clickOnElement(addTo);
    }


}
