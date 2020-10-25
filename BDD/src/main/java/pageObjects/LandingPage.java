package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By signin = By.cssSelector("a[href*='sign_in']"); // log in link identifier
	By signup = By.cssSelector("a[href*='sign_up']"); // register link identifier
	By title = By.cssSelector(".text-center>h2"); // feature courses title identifier
	By navigationBar = By.cssSelector("ul[class*='navbar-right']"); // navigation menu identifier

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// Signin
	public WebElement getLogin() {

		return driver.findElement(signin);
	}

	// Sign up

	public WebElement getSignup() {

		return driver.findElement(signup);
	}

	// Title
	public WebElement getTitle() {

		return driver.findElement(title);
	}

	// Navigation menu
	public WebElement getNavigationBar() {

		return driver.findElement(navigationBar);
	}

}
