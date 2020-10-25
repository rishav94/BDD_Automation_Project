package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {

	public WebDriver driver;

	By email = By.cssSelector("[id='user_email']"); // user email identifier
	By sendMeInstructions = By.cssSelector("[type='submit']"); // send me instructions button

	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getEmail() {
		// email address
		return driver.findElement(email);
	}

	public WebElement sendMeInstructions() {
		// send me instructions button
		return driver.findElement(sendMeInstructions);
	}

}
