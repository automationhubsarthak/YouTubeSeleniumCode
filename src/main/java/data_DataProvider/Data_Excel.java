package data_DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class Data_Excel {
	
	
	
	@DataProvider
	public static Object[][] getExcelData(Method name) throws Exception {
		System.out.println("Test Case which has the method is :" + name.getName());
		 Object data [][] = ExcelSheetCode.getTestData("Sheet1");	
	return data;
	
	}
	}

