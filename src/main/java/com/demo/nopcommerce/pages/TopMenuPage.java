package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TopMenuPage extends Utility {
    public void selectMenu(String menu) {


    }

    By computer = (By.xpath("//ul[@class='top-menu notmobile'] //a[text()='Computers ']"));

    public void clickOnComputer() {
        clickOnElement(computer);
    }

    public void getUrl() {
        String expectedPage = "https://demo.nopcommerce.com/computers";
        String actualPage = driver.getCurrentUrl();
        Assert.assertEquals(actualPage, expectedPage, "Page not found");
    }

}
