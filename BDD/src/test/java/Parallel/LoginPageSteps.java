package Parallel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
public class LoginPageSteps {

	private HomePage homePage = new HomePage(Base.getDriver());
	private LoginPage loginPage;
	private String title;

//	@Given("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		base.getDriver().get("http://www.qaclickacademy.com/");
//	}

	@Then("^user click on login link$")
	public void user_click_on_login_link() throws Throwable {
		loginPage = homePage.openloginPage();
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		title = loginPage.getLoginPageTitle();
		System.out.println(title);
	}

//	@Then("^page title should be \"([^\"]*)\"$")
//	public void page_title_should_be_something(String expectedTitle) throws Throwable {
//		Assert.assertTrue(title.equalsIgnoreCase(expectedTitle));
//	}

	@When("^user enters invalid (.+) and password (.+)$")
	public void user_enters_invalid_and_password(String username, String password) throws Throwable {
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
	public void forgot_password_link_should_be_displayed() throws Throwable {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	@Then("^verify that invalid email or password alert message appears$")
	public void verify_that_invalid_email_or_password_alert_message_appears() throws Throwable {
		Assert.assertTrue(loginPage.invalidLoginAlertAppears());
	}

	@And("^user clicks on Login button$")
	public void user_clicks_on_login_button() throws Throwable {
		loginPage.clickLogin();
	}

	@And("^verify that invalid email or password alert message does not appears$")
	public void verify_that_invalid_email_or_password_alert_message_does_not_appears() throws Throwable {
		Assert.assertFalse(loginPage.invalidLoginAlertAppears());
	}

}
