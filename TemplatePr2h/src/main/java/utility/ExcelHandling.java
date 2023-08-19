package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import testBase.TestBase;

public class ExcelHandling extends TestBase{
//	public void readExcel() throws IOException  {
	
	public Object getCellValue(int sheetNum, int rowNum, int cellNum) throws IOException {
		Object strValue = null;
		
		
	
		String path ="D:\\prathamesh.lad@nanostuffs.com\\FrameworkTemplate\\Final-Maven-Framework\\TemplatePr2h\\src\\test\\java\\testData\\Automation Test Cases.xlsx";
	
	File file = new File(path);
    FileInputStream fis;
	try {
		fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		try {
			strValue = wb.getSheetAt(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();			
		} catch (Exception e) {
			try {
				strValue = wb.getSheetAt(sheetNum).getRow(rowNum).getCell(cellNum).getNumericCellValue();			
				
			} catch (Exception e2) {
				logger.info("Unable to get value from the Excel Sheet");
				e.printStackTrace();
			}
		}
	} catch (FileNotFoundException e) {
		
		logger.info("Error while handling Excel");
		e.printStackTrace();
	}
	
	System.out.println(strValue);
	return strValue;
	
	
	
	
	
}}
