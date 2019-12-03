package testpages;

import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.WelcomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class WelcomeTestPage extends TestBase {

	WelcomePage wc;
	

	public WelcomeTestPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("INTIALLLLIXXXXXXXXX................");
		intilization();
		wc = new WelcomePage();
	}

	//@Test(priority = 1)
	public void pageTitle() {
		String title = wc.pageTitle();
		Assert.assertEquals("Demo Script Test drive - PHPTRAVELS", title);
	}

	//@Test(priority = 2)
	public void checkLinkPresent() {
		Assert.assertEquals("PRICING", wc.linkPresent());
		System.out.println("Test Pass --> clicked on pricing");
		wc.clickonPricing();
	}

	//@Test(priority = 3)
	public void checkValue() throws Exception {

		wc.clickonLogo();

		Assert.assertEquals("WORLD'S LEADING BOOKING SOFTWARE", wc.findText());
	}

	//@Test(priority = 4)
	public void checkProductMenuSize() throws Exception {
		Assert.assertEquals(5, wc.productListSize(),"Check Product Menu Size");
	}
	
	@Test(groups = "login")
	public void loginButton() throws Exception {
		
		Assert.assertEquals("Login", wc.FindLoginButton());
		wc.clickOnLogin();
		
		
	}
	
	
	@AfterMethod
	public void afterMethod() {

		//driver.close();
	}

}
