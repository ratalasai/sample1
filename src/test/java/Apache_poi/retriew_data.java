package Apache_poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class retriew_data {
	
	public static void main(String[] args) throws IOException {
		
	
	File file = new File("C:\\\\Users\\\\admin\\\\Downloads\\\\SampleData.xlsx");
	FileInputStream stream = new FileInputStream(file);
	
	XSSFWorkbook workbook = new XSSFWorkbook(stream);
	
	XSSFSheet sheet = workbook.getSheetAt(0);
	
	int rows = sheet.getPhysicalNumberOfRows();
	int colls = sheet.getRow(1).getLastCellNum();
	
	for(int i=1; i<rows; i++) {
		
		for(int j=1; j<colls; j++) {
			
			DataFormatter df = new DataFormatter();
			
			System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
		}
		
	}
	stream.close();
	workbook.close();

}
}
