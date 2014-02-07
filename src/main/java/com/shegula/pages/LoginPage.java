package com.shegula.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;




public class LoginPage  extends Page{
	
	private WebDriver driver;


	public LoginPage(WebDriver webDriver) {
		super(webDriver);			
	}

	@FindBy(id = "email")
	@CacheLookup
	private WebElement email;
	
	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(id = "login")
	@CacheLookup
	private WebElement submit;
	
	public boolean isPageOpened() {
		return email.isDisplayed();
	}	

	public LoginPage enterEmail(String email_) {
		email.sendKeys(email_);
		return this;
	}

	public LoginPage enterPassword(String password_) {
		password.sendKeys(password_);
		return this;
	}
	
	/*

	public AccountPage clickLogin() {
		submit.click();
		return PageFactory.initElements(driver, AccountPage.class);
	}

	*/

	
}
