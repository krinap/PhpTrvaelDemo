package testpages;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.WelcomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	
	@BeforeMethod
	public void beforeMethod()
	{
		
		loginPage = new LoginPage();
	}
	@Test(groups = "login")
	public void loginValidation() {

		System.out.println("CALLING TEST................");
		homePage = loginPage.login("krinap31193@gmail.com","Krina@93");

	}

	

}
