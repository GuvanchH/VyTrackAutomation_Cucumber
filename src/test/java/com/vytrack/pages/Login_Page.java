package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    
    public Login_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    
    
    @FindBy(id = "prependedInput")
    public WebElement inputUser;
    
    
    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;
    
    
    @FindBy(id = "_submit")
    public WebElement loginButton;
    
    @FindBy(id = "remember_me")
    public WebElement rememberMe;
    
    @FindBy(id = "remember_me")
    public WebElement ;
    
    
    
    
}
