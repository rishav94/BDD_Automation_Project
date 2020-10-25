package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By email = By.id("user_email"); // login user email
	By password = By.id("user_password"); // login password
	By login = By.cssSelector("input[value='Log In']"); // login button
	By invalidAlert=By.cssSelector("div[class='alert alert-danger alert-show mb-5']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// Email field
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	// password field
	public WebElement getPassword() {
		return driver.findElement(password);
	}

	// login Button
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement invalidLoginAlert() {
		return driver.findElement(invalidAlert);
	}

}
