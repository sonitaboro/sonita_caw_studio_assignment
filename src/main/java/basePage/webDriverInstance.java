package basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class webDriverInstance {
	
	public WebDriver getDriver() throws IOException {
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ 
				"\\CawInterview\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);
		
		if (prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ 
				"\\CawInterview\\src\\main\\java\\resources\\config.properties");
		}
		else {
			System.out.print("Not a chrome driver");
		}
		return driver;
		
	}
	

}
