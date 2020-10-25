
package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void intitlizer() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
	}

	@Test
	public void basePageNavigation() throws IOException {
		driver.manage().window().maximize();

		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
		log.info("succesfully get the title");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
