package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;

	// 1.By locator
	private By signin = By.cssSelector("a[href*='sign_in']"); // log in link identifier
	private By signup = By.cssSelector("a[href*='sign_up']"); // register link identifier
	private By title = By.cssSelector(".text-center>h2"); // feature courses title identifier
	private By navigationBar = By.cssSelector("ul[class*='navbar-right']"); // navigation menu identifier
	private By noThanks = By.xpath("//button[contains(text(),'NO THANKS')]");// noThanks button of popup
	private By newsLetter = By.xpath("//p[text()='Join Our Newsletter']");// header of newletter popup

	// 2. Constructor of the page class
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	// Page action: features of the pages in the form of methods.

	public String getPageTitle() {
		return driver.getTitle();
	}

	// Login
	public WebElement login() {

		return driver.findElement(signin);
	}
	// click login link and open login page

	public LoginPage openloginPage() {
		if (driver.findElement(newsLetter).isDisplayed()) {
			driver.findElement(noThanks).click();
			driver.findElement(signin).click();
		} else {
			driver.findElement(signin).click();
		}

		return new LoginPage(driver);
	}

	// Sign up

	public WebElement getSignup() {

		return driver.findElement(signup);
	}

	// Title
	public WebElement getTitleText() {

		return driver.findElement(title);
	}

	// Navigation menu
	public WebElement getNavigationBar() {

		return driver.findElement(navigationBar);
	}

}
