package com.caw.CawInterview;
import org.testng.Assert;import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basePage.basePage;
import pageObjects.testPageObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class inputTableData extends basePage{

	public inputTableData() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void driverSetUp() throws IOException {
		getDriver().get(getUrl());
	}
	@Test
	public void tableData() throws IOException {
		
		String inputTableData = "[{\"name\" : \"Bob\", \"age\" : 20, \"gender\": \"male\"}, {\"name\": \"George\", \"age\" : 42, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Sara\", \"age\" : 42, \"gender\": \"female\"}, {\"name\": \"Conor\", \"age\" : 40, \"gender\": \"male\"}, {\"name\":\r\n"
				+ "\"Jennifer\", \"age\" : 42, \"gender\": \"female\"}]";
		
		testPageObject tableData = new testPageObject();
		tableData.gettableDataBtn().click();
		System.out.print("Clicked on Table data button\n");
		
		tableData.gettableJsonData().clear();
		tableData.gettableJsonData().sendKeys(inputTableData);
		System.out.print("Entered Json data\n");
		
		tableData.getrefreshBtn().click();
		System.out.print("Clicked on Refresh button\n");
		
		JsonArray inputTableDatajsonArr = JsonParser.parseString(inputTableData ).getAsJsonArray();
		
		String tableText = tableData.getdynamicTable().getText();
		String[] tableRows = tableText.split("\n");
		
		//validating Json data with table data
		int rowIndex = 2;
		for (int i=0; i< inputTableDatajsonArr.size(); i++){
			JsonObject jsonObj = inputTableDatajsonArr.get(i).getAsJsonObject();
			String name = jsonObj.get("name").getAsString();
			String age = jsonObj.get("age").getAsString();
			String gender = jsonObj.get("gender").getAsString();

			//adjust this condition based on your table structure
			String row = tableRows[rowIndex];
			Assert.assertTrue(row.contains(name),"Name not found in the table");
			Assert.assertTrue(row.contains(age),"Age not found in the table");
			Assert.assertTrue(row.contains(gender),"Gender not found in the table");
			rowIndex++;
		}
		

		
		

	}

}
