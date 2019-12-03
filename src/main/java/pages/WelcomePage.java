package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class WelcomePage extends TestBase {


	@FindBy(xpath = "//b[contains(text(),'Pricing')]")
	WebElement link;

	@FindBy(xpath = "//nav[@id='ShopifyMainNav']//img[@class='img-responsive']")
	WebElement logo;

	@FindBy(xpath = "//h2[@class='strong']")
	WebElement worldText;

	@FindBy(xpath = "//input[@class='marketing-nav__button marketing-button marketing-button--small']")
	WebElement findLoginButton;

	// constructor
	public WelcomePage() {

		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {

		return driver.getTitle();
	}

	public String linkPresent() {
		// String linkText = ;
		return link.getText();
	}

	public void clickonPricing() {
		link.click();
		System.out.println("Get Pricing page");
	}

	public String findText() throws Exception {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", worldText);
		// String linkText = ;
		Thread.sleep(3000);

		return worldText.getText();
	}

	public void clickonLogo() {
		logo.click();
		System.out.println("Get Pricing page");
	}

	public int productListSize() {
		// we can directly use the option from the list tag as well.
		List<WebElement> listofProducts = driver.findElements(By.xpath(
				"//div[@id='Popover5']//ul[@class='popover-content__list']//ul[@class='popover-content__list']//a"));

		for (int i = 0; i < listofProducts.size(); i++) {
			System.out.println(listofProducts.get(i).getText());

		}

		return listofProducts.size();
	}

	public String FindLoginButton() {

		return findLoginButton.getAttribute("value");

	}

	public LoginPage clickOnLogin() throws Exception {
		
		
		String winHandleBefore = driver.getWindowHandle();
		findLoginButton.click();
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		return new LoginPage();
		

	}

}
