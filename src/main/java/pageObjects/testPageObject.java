package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basePage.basePage;

public class testPageObject extends basePage{

	public testPageObject() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebDriver driver = getDriver();
	
	By  tableDataBtn = By.tagName("summary");
	By  tableJsonData = By.id("jsondata");
	By  refreshBtn = By.id("refreshtable");
	By dynamicTable = By.id("dynamictable");
	
	
	public WebElement gettableDataBtn() {
		try {
			return this.driver.findElement(tableDataBtn);
		}catch(Exception e) {
			return null;
		}
		
	}
	
	public WebElement gettableJsonData() {
		return driver.findElement(tableJsonData);
	}
	
	public WebElement getrefreshBtn() {
		return driver.findElement(refreshBtn);
	}
	
	public WebElement getdynamicTable() {
		return driver.findElement(dynamicTable);
	}
	

}
