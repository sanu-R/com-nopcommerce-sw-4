package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.*;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourComputerPage buildYourComputerPage = new BuildYourComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        //1.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        Thread.sleep(1000);
        //1.2 Click on Desktop
        desktopPage.clickOnDesktop();
        Thread.sleep(1000);
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.sortPosition();
        Thread.sleep(1000);
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.verifySortIsArrangeInDescendingOrder();

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu.
        homePage.clickOnComputerMenu();
        Thread.sleep(1000);
        //2.2 Click on Desktop
        desktopPage.clickOnDesktop();
        Thread.sleep(1000);
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectSortByAToZ();
        Thread.sleep(1000);
        //2.4 Click on "Add To Cart"
        desktopPage.clickOnAddToCart();
        Thread.sleep(1000);
        //2.5 Verify the Text "Build your own computer"
        //  buildYourComputerPage.verifyTheTextBuildYourOwnComputer();
        Thread.sleep(1000);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourComputerPage.selectDualCorePentiumE();
        //2.7.Select "8GB [+$60.00]" using Select class.
        Thread.sleep(1000);
        buildYourComputerPage.selectGbFromEight();
        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourComputerPage.clickHhdRadio();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000);
        buildYourComputerPage.clickOsRadio();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        //[+$5.00]"
        buildYourComputerPage.clickOnTotalCommander();
        Thread.sleep(500);
        //2.11 Verify the price "$1,475.00"
        buildYourComputerPage.verifyThePriceForBuildYour();
        //2.12 Click on "ADD TO CARD" Button.
        Thread.sleep(1000);
        buildYourComputerPage.addToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top
        //green Bar
        buildYourComputerPage.verifyTheProductHasBeenAddedToYourCart();
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        buildYourComputerPage.closeTheSquareButtonOnRight();
        Thread.sleep(1000);
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourComputerPage.mouseHoverOnShoppingCart();
        buildYourComputerPage.goToCartButtonClick();
        Thread.sleep(1000);
        //2.15 Verify the message "Shopping cart"
        buildYourComputerPage.verifyTheMessageShoppingCartOne();
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingCartPage.ClearTheQtyFromTheBox();
        shoppingCartPage.addTheTwoQty();
        shoppingCartPage.updateShoppingCart();
        Thread.sleep(1000);
        //2.17 Verify the Total"$2,950.00"
        shoppingCartPage.verifyTotalPriceForPc();
        Thread.sleep(1000);
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.clickOnTermAndConditionCheckbox();
        //2.19 Click on “CHECKOUT”
        Thread.sleep(1000);
        shoppingCartPage.clickOnCheckOutButtonOnce();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        registerPage.verifyWelcomeMessage();
        //2.21Click on “CHECKOUT AS GUEST” Tab
        Thread.sleep(1000);
        registerPage.checkOutAsGuestClick();
        Thread.sleep(1000);
        //2.22 Fill the all mandatory field
        registerPage.enterTheFirstName();
        Thread.sleep(1000);
        registerPage.enterTheLastName();
        Thread.sleep(1000);
        registerPage.enterTheEmail();
        Thread.sleep(1000);
        registerPage.countryDropdownSelect();
        Thread.sleep(1000);
        registerPage.enterTheCityName();
        Thread.sleep(1000);
        registerPage.enterTheAddressFirstLine();
        Thread.sleep(1000);
        registerPage.enterPostalCode();
        Thread.sleep(1000);
        registerPage.enterThePhoneNumber();
        Thread.sleep(1000);

        //2.23 Click on “CONTINUE”
        registerPage.clickOnContinueBlueBox();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        Thread.sleep(1000);
        checkoutPage.clickOnRadioButtonNextDay();
        //2.25 Click on “CONTINUE”
        checkoutPage.enterOnContinue();
        Thread.sleep(1000);
        //2.26 Select Radio Button “Credit Card”
        checkoutPage.selectCardRadioButton();
        Thread.sleep(1000);
        //2.27 Select “Master card” From Select credit card dropdown
        checkoutPage.selectMasterCardOption();
        Thread.sleep(1000);
        //2.28 Fill all the details
        checkoutPage.enterCardHolderNameIn();
        Thread.sleep(1000);
        checkoutPage.enterCardHolderNumber();
        Thread.sleep(1000);
        checkoutPage.enterCardExpireMonth();
        Thread.sleep(1000);
        checkoutPage.enterCardExpireYear();
        Thread.sleep(1000);
        //2.29 Click on “CONTINUE”
        checkoutPage.clickContinueForGoing();
        Thread.sleep(1000);
        //2.30 Verify “Payment Method” is “Credit Card”
        checkoutPage.verifyPaymentMethod();
        //2.32 Verify “Shipping Method” is “Next Day Air”
        checkoutPage.verifyShippingMethod();
        Thread.sleep(1000);
        //2.33 Verify Total is “$2,950.00”
        checkoutPage.verifyTotalCost();
        Thread.sleep(1000);
        //2.34 Click on “CONFIRM”
        checkoutPage.clickOnConfirmOder();
        Thread.sleep(1000);
        //2.35 Verify the Text “Thank You”
        checkoutPage.verifyThankYouText();
        Thread.sleep(1000);
        //2.36 Verify the message “Your order has been successfully processed!”
        checkoutPage.verifyOderIsSuccessfullyProcessed();
        Thread.sleep(1000);
        //2.37 Click on “CONTINUE”
        checkoutPage.pressOnCon();
        Thread.sleep(1000);
        //2.37 Verify the text “Welcome to our store”
        checkoutPage.verifyWelcomeToOurStore();

    }


}
