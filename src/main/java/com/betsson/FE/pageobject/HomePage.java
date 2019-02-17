package com.betsson.FE.pageobject;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.betsson.FE.pageobject.base.BasePage;

public class HomePage extends BasePage {
	
	//Login
	//Create Account

	public @FindBy(xpath = ".//*[@test-id='nav-toolbar-create-account']") WebElement btn_CreateAccount;
	public @FindBy(xpath = ".//*[@test-id='nav-toolbar-login']")  WebElement btn_Login;
		
	public HomePage() throws IOException {
		super();
	}
	
	public RegisterPage clickCreateAccount() throws Exception
	{
		waitAndClickElement(btn_CreateAccount);
		return new RegisterPage();
		
	}
	
	public LoginPage clickLogin() throws Exception
	{
		waitAndClickElement(btn_Login);
		return new LoginPage();
	}
	
	

}
