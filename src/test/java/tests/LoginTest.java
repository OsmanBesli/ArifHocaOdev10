package tests;

import base.TestBase;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    @Test
    public void  login(){
        driver.get("https://www.saucedemo.com/");
        loginPage =new LoginPage(driver,driverWait);

        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("FailPassword");
        loginPage.clickSubmitButton();
        loginPage.assertResultText();
    }
}
