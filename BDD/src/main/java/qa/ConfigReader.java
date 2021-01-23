package qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	/*
	 * This method is used to load the properties from configuration properties file
	 */
	public Properties init_prop() {
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("./src/main/java/qa/data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}

}
