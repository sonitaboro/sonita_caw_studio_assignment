package basePage;

import org.openqa.selenium.WebDriver;

public class basePage extends webDriverInstance{
	
	public WebDriver driver;
	private String url;
	
	public String getUrl() {
		this.driver.get(url);
		return url;
	}
	

}
