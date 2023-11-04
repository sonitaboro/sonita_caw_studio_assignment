package basePage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class basePage{

	private String url;
	private Properties prop;
	
	public basePage() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\resources\\config.properties");
		prop.load(fis);
	}
	
	
	public static WebDriver getDriver() {
		return webDriverInstance.getDriver();
	}
	
	public String getUrl() throws IOException{
		url = prop.getProperty("url");
		return url;
	}

}
