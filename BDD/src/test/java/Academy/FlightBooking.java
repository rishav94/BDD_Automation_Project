package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import pageObjects.FlightBookingLandingPage;
import resources.Utilities;
import resources.base;

public class FlightBooking extends base{
	WebDriver driver;
	
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeMethod
	public void intilizer() throws IOException
	{
		driver=initializeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void baseFlightBooking() throws InterruptedException {
		FlightBookingLandingPage fb=new FlightBookingLandingPage(driver);
		fb.depatureCity().click();
		driver.findElement(By.cssSelector("a[value='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='JLR'])[2]")).click();
		//fb.depatureDate().click();
		System.out.println(fb.monthOfCalendar1().getText());
		Utilities ut= new Utilities(driver);
		ut.selectDate("November", "24");
		//Assert.assertTrue(fb.returnDate().);
		fb.returnDate().click();
		ut.selectDate("November", "28");
		fb.searchButton().click();
		
		
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
