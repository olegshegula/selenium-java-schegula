/**
 * 
 */
package com.shegula.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SkorozvonTests  extends TestBase{

/**
 * @author Oleg
 *
 */	
LoginPage loginpage;

@Parameters({ "path" })
@BeforeClass
public void testInit(String path) {
	// Load the page in the browser
	driver.get(baseUrl + path);
	loginpage = PageFactory.initElements(driver, LoginPage.class);
}
	@Test
	public void testLogin() throws Exception  {			
		driver.get(baseUrl);
		loginpage.enterEmail("stqa.gm@gmail.com");
		loginpage.enterPassword("162534");
		loginpage.clickLogin();
		
		AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
		Assert.assertTrue(accountPage.isPageOpened());
				
	}
	
}
