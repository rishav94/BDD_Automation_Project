package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import qa.Base;

import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
public class LoginPageSteps {

	private HomePage homePage = new HomePage(Base.getDriver());
	private LoginPage loginPage;
	public String title;


	@Given("^user is on login page$")
	public void user_is_on_login_page()  {
		loginPage = homePage.openloginPage();
		
	}
	
	@When("^user gets the title of the login page$")
    public void user_gets_the_title_of_the_login_page()  {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
    }

	

	@When("^user enters invalid (.+) and password (.+)$")
	public void user_enters_invalid_and_password(String username, String password)  {
		loginPage.enterEmail(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}

	@When("^user enters valid mail \"([^\"]*)\" and valid password \"([^\"]*)\"$")
	public void user_enters_valid_mail_something_and_valid_password_something(String validUserName, String validPswd)
			throws Throwable {
		loginPage.enterEmail(validUserName);
		loginPage.enterPassword(validPswd);
		loginPage.clickLogin();
	}

	@Then("^forgot password link should be displayed$")
	public void forgot_password_link_should_be_displayed()  {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@Then("^verify that invalid email or password alert message appears$")
	public void verify_that_invalid_email_or_password_alert_message_appears()  {
		Assert.assertTrue(loginPage.invalidLoginAlertAppears());
	}

	@And("^user clicks on Login button$")
	public void user_clicks_on_login_button()  {
		loginPage.clickLogin();
	}

	@And("^verify that invalid email or password alert message does not appears$")
	public void verify_that_invalid_email_or_password_alert_message_does_not_appears()  {
		Assert.assertFalse(loginPage.invalidLoginAlertAppears());
	}

}
