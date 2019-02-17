package com.betsson.FE.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.betsson.FE.pageobject.base.BasePage;


public class LoginPage extends BasePage {

	public @FindBy(xpath = ".//*[@test-id='login-username']") WebElement txt_Username;
	public @FindBy(xpath = ".//*[@test-id='login-password']") WebElement txt_Password;
	public @FindBy(xpath = ".//*[@test-id='login-submit']") WebElement btn_SignIn;
	
	public LoginPage() throws IOException
	{
		super();
	}
	
	public LoginPage enterUsername(String username) throws Exception
	{
		sendKeysToWebElement(txt_Username, username);
		return new LoginPage();
	}
	
	public LoginPage enterPassword(String password) throws Exception
	{
		sendKeysToWebElement(txt_Password, password);
		return new LoginPage();
	}
	
	public void clickSignIn() throws InterruptedException
	{
		waitAndClickElement(btn_SignIn);
	}
	
	
}
