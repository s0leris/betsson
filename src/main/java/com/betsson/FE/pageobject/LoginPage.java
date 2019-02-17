package com.betsson.FE.pageobject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.betsson.FE.pageobject.base.BasePage;


public class LoginPage extends BasePage {

	public @FindBy(id = "email") WebElement textbox_Email;
	public @FindBy(id = "pass") WebElement textbox_Password;
	public @FindBy(xpath = ".//input[@type='submit']") WebElement button_SignIn;
	
	public LoginPage() throws IOException
	{
		super();
	}
	
	public LoginPage enterUsername(String username) throws Exception
	{
		sendKeysToWebElement(textbox_Email, username);
		return new LoginPage();
	}
	
	public LoginPage enterPassword(String password) throws Exception
	{
		sendKeysToWebElement(textbox_Email, password);
		return new LoginPage();
	}
	
	public void clickSignIn() throws InterruptedException
	{
		waitAndClickElement(button_SignIn);
	}
	
	
}
