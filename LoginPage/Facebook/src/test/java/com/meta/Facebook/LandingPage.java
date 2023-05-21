package com.meta.Facebook;

import com.meta.Facebook.Configuration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#content > div > div > div > div._8esl > h2")
    public WebElement Header;
    public WebElement getHeader(){
        return Header;
    }

    @FindBy(css = "#email")
    public WebElement email;
    public WebElement getEmail(){
        return email;
    }

    @FindBy(css = "#pass")
    public WebElement password;
    public WebElement getPassword(){
        return password;
    }

    @FindBy(css = "button[name='login']")
    public WebElement LoginButton;
    public WebElement getLoginButton(){
        return LoginButton;
    }

    @FindBy(css = "._6ltj > a")
    public WebElement ForgotPassword;
    public WebElement getForgotPassword(){
        return ForgotPassword;
    }

    @FindBy(css = "[ajaxify='\\/reg\\/spotlight\\/']")
    public WebElement CreateNewAccount;
    public WebElement getCreateNewAccount(){
        return CreateNewAccount;
    }


}
