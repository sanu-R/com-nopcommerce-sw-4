package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronics = By.xpath("//a[text()='Electronics ']");
    By cellphone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By verifyCellphoneText = (By.xpath("//h1[normalize-space()='Cell phones']"));

    public void electronicsMenu() {
        mouseHoverToElement(electronics);
    }

    public void mouseHoverCellPhone() {
        mouseHoverToElementAndClick(cellphone);
    }

    public void verifyTheTextCellPhone() {
        verifyText(verifyCellphoneText, "Cell phones", "Cell phones text not found");

    }


}
