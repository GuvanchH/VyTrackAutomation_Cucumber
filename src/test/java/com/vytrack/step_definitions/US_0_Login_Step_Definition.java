package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_0_Login_Step_Definition {
    
    LoginPage loginPage = new LoginPage();
    
    @Given("user login as a truck driver using {string} and {string}")
    public void user_login_as_a_truck_driver_using_and(String userName, String password) {
        loginPage.inputUser.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.loginButton.click();
        
        
    }
    
    
    @Given("user login as a sales manager using {string} and {string}")
    public void user_login_as_a_sales_manager_using_and(String userName, String password) {
        loginPage.inputUser.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.loginButton.click();
        
    }
    
    @Given("user login as a store manager using {string} and {string}")
    public void user_login_as_a_store_manager_using_and(String userName, String password) {
        
        loginPage.inputUser.sendKeys(ConfigurationReader.getProperty(userName));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.loginButton.click();
    }
    
    
    @Then("user is on the home page and the title is {string}")
    public void userIsOnTheHomePageAndTheTitleIs(String expectedTitleName) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs(expectedTitleName));
        
        
        BrowserUtils.titleVerification(expectedTitleName);
    }
}
