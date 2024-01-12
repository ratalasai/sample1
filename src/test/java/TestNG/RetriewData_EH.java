package TestNG;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class RetriewData_EH {

	@DataProvider(name="userdetails")
	
	public void Exceldata() throws Throwable {
	
	File file = new File("C:\\Users\\admin\\Downloads\\EH Loginsheet.xlsx");
	FileInputStream stream = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(stream);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rows = sheet.getPhysicalNumberOfRows();
		
		int cols = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<rows-1; i++) {
			
			for(int j=0; j<cols-1; j++) {
				
				DataFormatter df = new DataFormatter();
				
				Object[][] info = new Object[rows-1][cols];
				info[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		}
	
	
	
	}
	
}
