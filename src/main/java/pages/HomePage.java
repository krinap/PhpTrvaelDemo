package pages;

import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
