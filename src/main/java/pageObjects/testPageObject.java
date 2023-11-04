package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.basePage;

public class testPageObject extends basePage{
	
	public WebDriver driver;
	
	WebElement tableData = (WebElement) By.cssSelector("summary");
	By textArea = By.id("jsondata");
	By refreshBtn = By.id("refreshtable");
	
	public WebElement gettableData() {
		return tableData;
	}
	
	public WebElement getTextArea() {
		return (WebElement) textArea;
		
	}
	
	
	

}
