package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.pages.TopMenuPage;
import com.demo.nopcommerce.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopManuTest extends BaseTest {

    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void verifyPageNavigation() {
        //   1.2 This method should click on the menu whatever name is passed as parameter.
        topMenuPage.selectMenu("Computer");
        // 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
        //  select the Menu and click on it and verify the page navigation.
        topMenuPage.clickOnComputer();
        topMenuPage.getUrl();
    }


}
