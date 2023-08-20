package utility;

import java.io.IOException;
import java.util.ArrayList;
import testBase.TestBase;

public class ExcelLoop extends TestBase {
	public static ArrayList<String> testCaseName = new ArrayList<String>();



	public void testCaseList() {
		Object excelValue = null;
		ExcelHandling getValue = new ExcelHandling();
//        logger.info("ExcelHandling class Initialized");
		for (int i = 1; i<10;i++){
			
			
        try {
        	excelValue = getValue.getCellValue(0, i, 5);
			String excelValue2 = String.valueOf(excelValue);

			testCaseName.add(excelValue2);
//	        System.out.println("a");
			
        	} catch (IOException e) {
			break;
		}
        
        

		}
//		System.out.println(testCaseName);		
		
	}
	
}


