package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerMenu = (By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));

    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }


}
