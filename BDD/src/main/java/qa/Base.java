package qa;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {

	public WebDriver driver;
	// private Properties prop;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the threadlocal driver on the bases of
	 * given browser
	 * 
	 * @return this will return tldriver
	 * @throws IOException
	 */
	public WebDriver initializeDriver(String browser) throws IOException {
//		prop = new Properties();
//		FileInputStream fis = new FileInputStream(
//				System.getProperty("user.dir") + "\\src\\main\\java\\qa\\data.properties");
//		prop.load(fis);

		if (browser.equalsIgnoreCase("chrome")) {
			// execute in chrome browser

			// System.setProperty("webdriver.chrome.driver",
			// "D://Automation//eclipse//chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			// execute in firefox
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}

		else if (browser.equalsIgnoreCase("safari")) {
			// execute in IE
			tlDriver.set(new SafariDriver());

		} else {
			System.out.println("Please pass the correct browser value" + browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return getDriver();

	}

	/*
	 * this method is to get the driver with ThreadLocal
	 */
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}

}
