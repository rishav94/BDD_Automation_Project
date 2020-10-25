package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBookingLandingPage {
	WebDriver driver;
    private By depatureCity= By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']");
    //private By selectDepatureCity = By.cssSelector("a[value='BOM']");
    private  By arrivalCity= By.cssSelector("input[id='ctl00_mainContent_ddl_destinationStation1_CTXT']");
   // private By selectArrivalCity = By.cssSelector("a[value='DEL']");
    private By depatureDate= By.id("ctl00_mainContent_view_date1");
    private By returnDate= By.id("ctl00_mainContent_view_date2");
    private By departcal1=By.cssSelector("div[class='ui-datepicker-group ui-datepicker-group-first']");
    private By monthCal1=By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-group ui-datepicker-group-first'] /div/div //span[@class='ui-datepicker-month']");
    private By monthCal2=By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-group ui-datepicker-group-last'] /div/div //span[@class='ui-datepicker-month']");
    private By yearCal1=By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-group ui-datepicker-group-last'] /div/div //span[@class='ui-datepicker-month']");
    private By yearCal2=By.xpath("//div[@id='ui-datepicker-div'] //div[@class='ui-datepicker-group ui-datepicker-group-last'] /div/div //span[@class='ui-datepicker-year']");
    private By nextMonth=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    private By previousMonth=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']");
    private By searchButton=By.id("ctl00_mainContent_btn_FindFlights");
    
    
    public  FlightBookingLandingPage(WebDriver driver){
    	this.driver=driver;    	
    }
    
    public WebElement depatureCity() {
    	return driver.findElement(depatureCity);
    }
//    public WebElement selectDepatureCity() {
//    	return driver.findElement(selectDepatureCity);
//    }
    
    public WebElement arrivalCity() {
    	return driver.findElement(arrivalCity);
    }
//    public WebElement selectArrivalCity() {
//    	return driver.findElement(selectArrivalCity);
//    }
    public WebElement depatureDate() {
    	return driver.findElement(depatureDate);
    }
    public WebElement returnDate() {
    	return driver.findElement(returnDate);
    }
    public WebElement monthOfCalendar1() {
    	return driver.findElement(monthCal1);
    }
    public WebElement monthOfCalendar2() {
    	return driver.findElement(monthCal2);
    }
    public WebElement yearOfCalendar1() {
    	return driver.findElement(yearCal1);
    }
    public WebElement yearOfCalendar2() {
    	return driver.findElement(yearCal2);
    }
    
    public WebElement moveNextMonth() {
    	return driver.findElement(nextMonth);
    }
    public WebElement movePreviousMonth() {
    	return driver.findElement(previousMonth);
    }

    public WebElement searchButton() {
    	return driver.findElement(searchButton);
    }
}
