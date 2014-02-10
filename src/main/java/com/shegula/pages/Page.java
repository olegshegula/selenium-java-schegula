package com.shegula.pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

/*
 * Abstract class representation of a Page in the UI. Page object pattern
 * 
 * @author 
 */
public abstract class Page {

	protected WebDriver webDriver;

	/*
	 * Constructor injecting the WebDriver interface
	 * 
	 * @param webDriver
	 */
	public Page(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebDriver getWebDriver() {
		return webDriver;
	}

	public String getTitle() {
		return webDriver.getTitle();
	}
	
	public Page ensurePageLoaded(){
		return this;
		
	}
	
	public boolean waitPageLoaded(){
		try {
			ensurePageLoaded();
			return true;
		} catch (TimeoutException to) {
			return false;
		}
	}

}
