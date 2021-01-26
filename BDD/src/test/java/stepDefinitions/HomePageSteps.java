package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import junit.framework.Assert;
import pageObjects.HomePage;
import qa.Base;

import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
public class HomePageSteps {
	
	private HomePage homePage=new HomePage(Base.getDriver());
	public String title;
	
    @Given("^user is on home page$")
    public void user_is_on_home_page()  {
        Base.getDriver().get("http://www.qaclickacademy.com/");
    }

    @When("^user gets the title of the page$")
    public void user_gets_the_title_of_the_page()  {
        title= homePage.getPageTitle();
        System.out.println("Page title is: " + title );
    }

    @Then("^page title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String expectedTitleName)  {
    	Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Then("^navigation menu should be displayed$")
    public void navigation_menu_should_be_displayed()  {
        Assert.assertTrue(homePage.getNavigationBar().isDisplayed());
    }

    @Then("^News is visible to user$")
    public void news_is_visible_to_user()  {
       System.out.println("Code is not implemented yet");
    }

    @Then("^verify that title is \"([^\"]*)\"$")
    public void verify_that_title_is_something(String strArg1) {
        Assert.assertTrue(homePage.getTitleText().isDisplayed());
    }

}