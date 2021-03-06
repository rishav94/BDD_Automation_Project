package Parallel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.Base;
import qa.ConfigReader;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApplicationHooks{
	private Base base;
	private WebDriver driver;
	private ConfigReader cnf;
	Properties prop;
	@Before(value = "@Skip",order=0)
	public void skip_Scenario(Scenario scenario) {
		System.out.println("Skiped Scenario is:"+scenario.getName());
		Assume.assumeTrue(false);
	}
	@Before(order = 0)
	public void getProperty() {
		cnf = new ConfigReader();
		prop = cnf.init_prop();

	}

	@Before(order = 1)
	public void launchBrowser() throws IOException {
		String browserName = prop.getProperty("browser");
		base = new Base();
		driver = base.initializeDriver(browserName);

	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
			
		}
	}

}
