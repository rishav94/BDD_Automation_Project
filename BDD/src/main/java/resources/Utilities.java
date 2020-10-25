package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.FlightBookingLandingPage;

public class Utilities {
	 WebDriver driver;
	 public  Utilities(WebDriver driver){
	    	this.driver=driver;    	
	    }
	
	
	public void selectDate(String month, String date) {
		// TODO Auto-generated method stub
		FlightBookingLandingPage fb=new FlightBookingLandingPage(driver);
		
		 while(!fb.monthOfCalendar1().getText().contains(month) ) {
			 fb.moveNextMonth().click();
		 }
		 
		 List<WebElement> dates=driver.findElements(By.className("ui-state-default"));
		 int count=driver.findElements(By.className("ui-state-default")).size();
		 for(int i=0;i<=count;i++) {
			 String cal_date=driver.findElements(By.className("ui-state-default")).get(i).getText();
			 if(cal_date.equalsIgnoreCase(date)) {
				 driver.findElements(By.className("ui-state-default")).get(i).click();
				 break;
			 }
		 }
		

	}

}
