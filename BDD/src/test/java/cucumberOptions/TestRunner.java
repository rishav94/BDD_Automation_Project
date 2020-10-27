package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue= {"stepDefinitions"},
		monochrome=true,
		plugin= {"pretty","html:target/Html/Reports"})

//public class TestRunner extends AbstractTestNGCucumberTests {
//
//}

public class TestRunner {

}