package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;


public class LoginPage extends TestBase {
	
	
	
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	@FindBy(xpath = "//input[@id='inputEmail']")
	WebElement emailId;

	@FindBy(xpath = "//input[@id='inputPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='login']")
	WebElement loginButton;

	
	public HomePage login(String email, String pwd) {
		
		emailId.sendKeys(email);
		password.sendKeys(pwd);
		loginButton.click();

		return new HomePage();

	}

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

}
