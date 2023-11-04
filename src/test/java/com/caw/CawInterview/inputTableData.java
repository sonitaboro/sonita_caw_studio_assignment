package com.caw.CawInterview;

import org.testng.annotations.Test;

import pageObjects.testPageObject;

public class inputTableData extends testPageObject{
	
	public inputTableData() {
		super();
	}
	
	@Test
	public void tableData() {
		testPageObject data = new testPageObject();
		data.gettableData().click();
		data.getTextArea().sendKeys("[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, {\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Sara\", \"age\" : 42, \"gender\": \"female\"}, {\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]");

		
	}

}
