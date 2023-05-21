package com.meta.Facebook;

import com.meta.Facebook.Configuration.BaseClass;
import com.meta.Facebook.Utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

    @Test
    void loginpage() {

        LandingPage lp = new LandingPage(driver);

        //Home URL is Valid
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+ baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is Visible");
        sleepTime(1000);

        //Header Validation
        if (lp.getHeader().isDisplayed()){
            String header2 = lp.getHeader().getText();
            Assert.assertEquals(header2, Data.HEADER);
            System.out.println("Header Text Is Valid");
        }else {
            System.out.println("Header isn't Visible");
        }

        //Validate Email Address
        lp.getEmail().sendKeys(Data.EMAIL);
        sleepTime(1000);

        //Validate Password
        lp.getPassword().sendKeys(Data.PASSWORD);
        sleepTime(1000);

        //Click On LogIn Button
        lp.getLoginButton().click();
        sleepTime(1000);

        //Back TO Base URL
        driver.navigate().back();
        sleepTime(1000);

        //Click On Forgot Password
        lp.getForgotPassword().click();
        sleepTime(1000);

        //Back to Base Url
        driver.navigate().back();
        sleepTime(1000);

        //Click On Create New Account
        lp.getCreateNewAccount().click();
        sleepTime(1000);

        //Back to Home
        driver.navigate().to(Data.BASE_URL);
        sleepTime(1000);
        driver.quit();

    }
}
