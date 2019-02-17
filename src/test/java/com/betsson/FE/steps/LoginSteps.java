package com.betsson.FE.steps;

import com.betsson.FE.core.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverFactory {

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.loadUrl("http://www.betsson.com");
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is a test2");
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is a test3");
	}

	@When("^User click on the signin button$")
	public void user_click_on_the_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is a test4");
	}

	@Then("^User is logged in successfully$")
	public void user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("this is a test5");
	}
	
}
