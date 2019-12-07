package org.testleaf.pages;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.testleaf.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{

	public LoginPage enterUsername(String data) {
		//driver = new ChromeDriver();
		driver.findElementById("username").sendKeys(data);
		return this;
	}
	public LoginPage enterPassword(String data) {
		driver.findElementById("password").sendKeys(data);
		return this;
	}
	public HomePage clickOnSubmit() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}
