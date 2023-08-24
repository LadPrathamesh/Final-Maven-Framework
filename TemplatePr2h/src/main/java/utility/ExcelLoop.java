package utility;

import java.io.IOException;
import java.util.ArrayList;
import testBase.TestBase;

public class ExcelLoop extends TestBase {
	public static ArrayList<String> testCaseName = new ArrayList<String>();



	public void testCaseList() {
		Object excelValue = null;
		Object decision = null;
		ExcelHandling getValue = new ExcelHandling();
//        logger.info("ExcelHandling class Initialized");
		for (int i = 1; i<10;i++){
			
			
        try {
        	decision = getValue.getCellValue(0, i, 6);
			String decision2 = String.valueOf(decision);
			
			if(decision2.equalsIgnoreCase("Yes")) {
        	
				excelValue = getValue.getCellValue(0, i, 5);
				String excelValue2 = String.valueOf(excelValue);

				testCaseName.add(excelValue2);
				System.out.println(excelValue2);
				System.out.println("Testing value");
			
				}
			} catch (IOException e) {
			break;
		}
        
        

		}
//		System.out.println(testCaseName);		
		
	}
	
}


