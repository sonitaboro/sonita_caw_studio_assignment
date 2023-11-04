package basePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverInstance {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		if(driver==null) {
			try {
				driver = createDriver();
			}
			catch(IOException e) {
				System.err.print("Driver Error");
			}
		}
	
		return driver;
		
	}
	
	public static WebDriver createDriver() throws IOException {
		
		WebDriver driver = null;
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ 
				"\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);
		
		if (prop.getProperty("browser").equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pavan Guest\\Desktop\\Resources\\Workspace\\CawInterview\\src\\main\\java\\driver\\chromedriver.exe");
			
					/*System.getProperty(("user.dir")+ "\\src\\main\\java\\driver\\chromedriver.exe")*/
			driver = new ChromeDriver();
		}
		else {
			System.out.print("Not a chrome browser");
		}
		
		return driver;
		
	}
	
	public static void cleanUpDriver() {
		driver.quit();
	}

}
