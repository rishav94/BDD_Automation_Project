package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	// 1.By locator
	private By email = By.id("user_email"); // login user email
	private By password = By.id("user_password"); // login password
	private By login = By.cssSelector("input[value='Log In']"); // login button
	private By invalidAlert=By.cssSelector("div[class*='alert-danger']"); // invalid message
	private By forgotPassword=By.cssSelector("[href*='password/new']");// forget password

	// 2. Constructor of the page class
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	// Page action: features of the pages in the form of methods.
	// Page Title
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	// Email field
	public void enterEmail(String userEmail) {
		driver.findElement(email).sendKeys(userEmail);
	}

	// password field
	public void enterPassword(String pswd) {
		driver.findElement(password).sendKeys(pswd);
	}

	// login Button
	public void clickLogin() {
		 driver.findElement(login).click();
		 
	}
	
	public boolean invalidLoginAlertAppears() {
		 return driver.findElement(invalidAlert).isDisplayed();
	}
	
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPassword).isDisplayed();
	}
	
	public ForgotPassword clickForgotPwdLink() {
	 driver.findElement(forgotPassword).click();
	 return new ForgotPassword(driver);
	}

}
