//10342b846a60402c9de3cc60922cfdfd
package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

@Test
public class HomePage extends base {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeMethod
	public void intitlizer() throws IOException {

		log.info("driver initialized");
	}

// login two times with valid credentials and invalid credentials
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password, String text) throws IOException {

		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		// sdriver.findElement(By.xpath("//@button[text()='NO THANKS']")).click();
		driver.manage().window().maximize();

		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();

		LoginPage l = new LoginPage(driver);
		l.getLogin().sendKeys(username);
		l.getPassword().sendKeys(password);
		l.getLogin().click();
		// System.out.println(text);
		log.info(text);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "invaliduser@qa.com";
		data[0][1] = "passwrd2456312";
		data[0][2] = "invalid user";

		data[1][0] = "validuser@qa.com";
		data[1][1] = "paswrhf679";
		data[1][2] = "valid user";
		return data;

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
