/**
 * 
 */
package com.shegula.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


/**
 * @author shcegula-os
 * 
 */
public class AccountPage extends Page {

	private WebDriver driver;

	public AccountPage(WebDriver webDriver) {
		super(webDriver);
		
	}

	@FindBy(xpath = "//a[text()='Прозвон']")
	@CacheLookup
	private WebElement leads;

	/*
	 * (non-Javadoc)
	 * 
	 * 
	 */

	public boolean isPageOpened() {
		return leads.isDisplayed();
	}
	/*
	 * public LeadsPage clickMenuLeads(){ leads.click(); return
	 * PageFactory.initElements(driver, LeadsPage.class); }
	 */
}
