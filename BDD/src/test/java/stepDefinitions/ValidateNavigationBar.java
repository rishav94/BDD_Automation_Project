package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

@RunWith(Cucumber.class)
public class ValidateNavigationBar extends base {

	@Given("^Initilize the broswer$")
	public void initilize_the_chrome_broswer() throws Throwable {
		driver = initializeDriver();
	}
	
	@And("^Open \"([^\"]*)\"$")
	public void navigate_to_link_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		// sdriver.findElement(By.xpath("//@button[text()='NO THANKS']")).click();
		driver.manage().window().maximize();
	}

	@When("^User opens landing page$")
	public void user_opens_landing_page_navigation_menu_should_be_visible_to_user() throws Throwable {
		Assert.assertTrue(driver.getTitle().equals("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"));
	}

	@Then("^navigation menu is visible$")
	public void verify_that_navigation_menu_is_visible() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavigationBar().isDisplayed());
		
	}
	 @And("^close browser$")
	    public void close_browser() throws Throwable {
		 driver.close();
	    }

}
