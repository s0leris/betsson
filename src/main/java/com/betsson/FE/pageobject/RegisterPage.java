package com.betsson.FE.pageobject;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.betsson.FE.pageobject.base.BasePage;

public class RegisterPage extends BasePage {

	public RegisterPage() throws IOException {
		super();
	}

	//email
	//password
	//firstname
	//lastname
	//dateofbirth
	//malefemale
	//street
	//postcode
	//city
	//country (default) to do later
	//currency (default) to do later
	//phone prefix (default) to do later
	//phone number
	//deposit limit (default) to do later
	//policy
	//TnCs
	//complete registration
	
	//masdas@yopmail.net
	//Test123!
	
	public @FindBy(xpath = ".//input[@test-id='register-email']") WebElement txt_Email;
	public @FindBy(xpath = ".//input[@test-id='register-password']")  WebElement txt_Password;
	public @FindBy(xpath = ".//input[@test-id='register-first-name']")  WebElement txt_FirstName;
	public @FindBy(xpath = ".//input[@test-id='register-surname']")  WebElement txt_LastName;
	public @FindBy(xpath = ".//*[@test-id='register-date-of-birth']")  WebElement txt_DOB;
	//just temp - sorry should not be absolute but relative =(
	public @FindBy(xpath = "/html/body/ion-app/ion-picker-cmp/div/div[1]/div[2]/button")  WebElement txt_DOBOK;
	public @FindBy(id = "rb-19-0") WebElement txt_MaleFemale;
	public @FindBy(xpath = ".//*[@test-id='register-continue-btn']")  WebElement txt_RegContinue;
	public @FindBy(xpath = ".//*[@test-id='register-street']")  WebElement txt_Street;
	public @FindBy(xpath = ".//*[@test-id='register-postcode']")  WebElement txt_Postcode;
	public @FindBy(xpath = ".//*[@test-id='register-city']")  WebElement txt_City;
	public @FindBy(xpath = ".//*[@test-id='register-phone-number']")  WebElement txt_Phone;
	public @FindBy(id = "toggle-38-0") WebElement txt_Policy;
	public @FindBy(id = "toggle-25-0")  WebElement txt_TnCs;
	
	//to assert on message
	public @FindBy(xpath = "//div[@label='First Name']") WebElement lbl_registerOK;
	public @FindBy(xpath = ".//*[@class='alert-button alert-button-md alert-button-default alert-button-default-md ng-star-inserted']")  WebElement btn_registerOK;

	
	public RegisterPage EnterEmail(String email) throws Exception
	{
		sendKeysToWebElement(txt_Email, email);
		return new RegisterPage();
	}
	
	public RegisterPage EnterPassword(String password) throws Exception
	{
		sendKeysToWebElement(txt_Password, password);
		return new RegisterPage();
	}
	
	public RegisterPage EnterFirstName(String firstname) throws Exception
	{
		sendKeysToWebElement(txt_FirstName, firstname);
		return new RegisterPage();
	}
	
	public RegisterPage EnterLastName(String lastname) throws Exception
	{
		sendKeysToWebElement(txt_LastName, lastname);
		return new RegisterPage();
	}
	
	//needs adjusting
	public void SetDOB() throws Exception
	{
		//default value for now
		waitAndClickElement(txt_DOB);
		waitAndClickElement(txt_DOBOK);
	}
	
	public void clickMaleFemale() throws Exception
	{
		//ideal bool value as param
		//we will click female for now
		waitAndClickElement(txt_MaleFemale);
	}
	
	public void clickRegContinue() throws Exception
	{
		//ideal bool value as param
		waitAndClickElement(txt_RegContinue);
	}
	
	public RegisterPage EnterStreet(String street) throws Exception
	{
		sendKeysToWebElement(txt_Street, street);
		return new RegisterPage();
	}
	
	public RegisterPage EnterPostCode(String postcode) throws Exception
	{
		sendKeysToWebElement(txt_Postcode, postcode);
		return new RegisterPage();
	}
	
	public RegisterPage EnterCity(String city) throws Exception
	{
		sendKeysToWebElement(txt_City, city);
		return new RegisterPage();
	}
	
	public RegisterPage EnterPhone(String phone) throws Exception
	{
		sendKeysToWebElement(txt_Phone, phone);
		return new RegisterPage();
	}
	
	public void ClickPolicy() throws Exception
	{
		waitAndClickElement(txt_Policy);
	}
	
	public void ClickTandCs() throws Exception
	{
		waitAndClickElement(txt_TnCs);
	}
	
	public void ClickAcceptRegistration() throws Exception
	{
		waitAndClickElement(btn_registerOK);
	}
	
}
