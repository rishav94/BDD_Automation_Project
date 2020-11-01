package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class ValidateWorngCredentialLoginTest extends base {

	@Given("^Initilize the chrome broswer$")
	public void initilize_the_chrome_broswer() throws Throwable {
		driver = initializeDriver();

	}

	@And("^Navigate to link \"([^\"]*)\"$")
	public void navigate_to_link_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		// sdriver.findElement(By.xpath("//@button[text()='NO THANKS']")).click();
		driver.manage().window().maximize();
	}

	@And("^Click on Login link in home page to land on login page$")
	public void click_on_login_link_in_home_page_to_land_on_login_page() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
	}

	@When("^user loging into with (.+) and password (.+) and logs in$")
	public void user_loging_into_with_and_password_and_logs_in(String username, String password) throws Throwable {
		LoginPage l = new LoginPage(driver);
		l.getLogin().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getLogin().click();
	}

	@Then("^verify that user could not loggedin$")
	public void verify_that_user_is_successfully_loggedin() throws Throwable {
		LoginPage l = new LoginPage(driver);
		Assert.assertTrue(l.invalidLoginAlert().isDisplayed());
		driver.close();
	}
	
	

}