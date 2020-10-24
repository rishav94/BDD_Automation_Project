package stepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition  {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //throw new PendingException();
    	System.out.println("User is on landing page");
        
    }

    
    @When("^user loging into with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_loging_into_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println(strArg1);
    	System.out.println(strArg2);
    }


    @Then("^Home page is populated $")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page");
    }

  
   
    @Then("^Cards are displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("cards are visible"+ arg1);
    }

}