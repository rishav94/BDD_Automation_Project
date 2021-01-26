package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/features"},
		glue= {"stepDefinitions","AppHooks"},
		//strict = true,
		monochrome=true,
		tags="",
		plugin= {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"rerun:target/failedRerun.txt" // save failed scenario under target folder in failedRun text file

				
				}
		)

//public class TestRunner extends AbstractTestNGCucumberTests {
//
//}

public class TestRunner {

}