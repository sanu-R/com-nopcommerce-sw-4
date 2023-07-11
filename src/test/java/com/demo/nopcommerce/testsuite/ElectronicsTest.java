package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.CellPhonePage;
import com.demo.nopcommerce.pages.ElectronicsPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.pages.ShoppingCartPage;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage = new ElectronicsPage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {
        //1.1 Mouse Hover on “Electronics” Tab
        electronicsPage.electronicsMenu();
        Thread.sleep(1000);
        //1.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverCellPhone();
        Thread.sleep(1000);
        //1.3 Verify the text “Cell phones”
        electronicsPage.verifyTheTextCellPhone();
        Thread.sleep(1000);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        //2.1 Mouse Hover on “Electronics” Tab
        electronicsPage.electronicsMenu();
        //2.2 Mouse Hover on “Cell phones” and click
        electronicsPage.mouseHoverCellPhone();
        Thread.sleep(1000);
        //2.3 Verify the text “Cell phones”
        electronicsPage.verifyTheTextCellPhone();
        //2.4 Click on List View Tab
        cellPhonePage.clickOnListViewTab();
        Thread.sleep(1000);
        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonePage.clickOnNokiaLumia1020();
        Thread.sleep(1000);
        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(1000);
        cellPhonePage.verifyTheNameLumia();
        //2.7 Verify the price “$349.00”
        Thread.sleep(1000);
        cellPhonePage.verifyThePriceLumia();
        //2.8 Change quantity to 2
        Thread.sleep(1000);
        cellPhonePage.clearTheQuantity();
        Thread.sleep(1000);
        cellPhonePage.enterNewTheQuantity();
        //2.9 Click on “ADD TO CART” tab
        Thread.sleep(1000);
        cellPhonePage.clickOnAddToCartButton();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        Thread.sleep(1000);
        cellPhonePage.verifyTheProductHasBeenAdded();
        Thread.sleep(1000);
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        cellPhonePage.clickOnCrossSquare();
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhonePage.mouseHoverOnCartTop();
        Thread.sleep(1000);
        cellPhonePage.clickOnGoToCartRectangle();
        //2.12 Verify the message "Shopping cart"
        shoppingCartPage.verifyShoppingCartText();
        Thread.sleep(1000);
        //2.13 Verify the quantity is 2
        shoppingCartPage.VerifyTheCartQty();
        Thread.sleep(1000);
        //2.14 Verify the Total $698.00
        shoppingCartPage.verifyTheTotal();
        Thread.sleep(1000);
        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTeamsSquare();
        Thread.sleep(1000);
        //2.16 Click on “CHECKOUT”
        shoppingCartPage.clickOnLastCheckOutButton();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        shoppingCartPage.verifyWellComingText();
        //2.18 Click on “REGISTER” tab
        Thread.sleep(1000);
        registerPage.clickOnBlueRegister();
        //2.19 Verify the text “Register”
        Thread.sleep(1000);
        registerPage.checkRegisterText();
        Thread.sleep(1000);
        //2.20 Fill the mandatory fields
        registerPage.enterYourFirstName();
        Thread.sleep(1000);
        registerPage.enterYourLastNameToField();
        Thread.sleep(1000);
        registerPage.enterYourEmailToEmailField();
        Thread.sleep(1000);
        registerPage.writeYourPassword();
        Thread.sleep(1000);
        registerPage.rewriteYourPasswordToPasswordField();
        Thread.sleep(1000);
        //2.21 Click on “REGISTER” Button
        registerPage.pressLastRegisterField();
        Thread.sleep(1000);
        //2.22 Verify the message “Your registration completed”
        registerPage.yourRegHasCompleted();
        Thread.sleep(1000);


    }

}
