//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//
//
//
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features= {"src/test/java/features"},
//		glue= {"Parallel"},
//		//strict = true,
//		monochrome=true,
//		plugin= {"pretty",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//				"timeline:test-output-thread/"
//
//				
//				}
//		)
//
////public class TestRunner extends AbstractTestNGCucumberTests {
////
////}
//
//public class ParallelRun extends AbstractTestNGCucumberTests {
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//		return super.scenarios();
//	}
//}
