package com.betsson.FE.steps;

import com.betsson.FE.core.DriverFactory;
import com.betsson.FE.core.functions.Generator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {
	
	//store registered username and password
	String username;
	String password;
	
	@Given("^I go to the following site \"([^\"]*)\"$")
	public void i_go_to_the_following_site(String url) throws Throwable {
		homePage.loadUrl(url);
	}

	@When("^I register a new user successfully$")
	public void i_register_a_new_user_successfully() throws Throwable {
		homePage.clickCreateAccount();
		registerPage.EnterEmail(Generator.generateRandomString(10)+"@yopmail.com");
		registerPage.EnterPassword(Generator.generateRandomString(10));
		registerPage.EnterFirstName(Generator.generateRandomString(10));
		registerPage.EnterLastName(Generator.generateRandomString(10));
		registerPage.SetDOB();
		registerPage.clickMaleFemale();
		//.....
		//we do an assert TRUE for successful registration message
		
	}

	@Then("^I am able to login with the credentials registered$")
	public void i_am_able_to_login_with_the_credentials_registered() throws Throwable {
	    loginPage.enterUsername(username);
	    loginPage.enterPassword(password);
	    loginPage.clickSignIn();
	    //we assert to make sure that we logged in successfully
		
	}
	
}
