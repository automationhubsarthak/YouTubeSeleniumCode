package data_DataProvider;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetCode {
	
	public static Workbook book;
	public  static Sheet sheet;
	public static String TESTDATA_SHEET_PATH = "D:\\SELENIUM\\UsernamePwd1.xlsx";
	
	public static Object[][] getTestData(String sheetName) throws Exception {
		
		//FileInputStream file = null;
		
			FileInputStream	file = new FileInputStream(TESTDATA_SHEET_PATH);		
		 book = WorkbookFactory.create(file);
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
		for(int i =0; i < sheet.getLastRowNum(); i++) {
			for(int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}		
		}
		return data;
}

}
