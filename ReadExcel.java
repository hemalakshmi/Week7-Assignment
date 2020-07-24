package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static String[][] readExcelData(String excelFileName) throws IOException {
	// 1. Go to the folder and open the file - path/location
	XSSFWorkbook book = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
	// 2. Select the Sheet - Sheet name/ index
	// XSSFSheet sheet = book.getSheet("Sheet1");
	XSSFSheet sheet = book.getSheetAt(0);
	// 3. You need to iterate over the rows - row count
	int rowCount = sheet.getLastRowNum();
	System.out.println(rowCount);
	// 4. You need Col size to iterate over the cells
	XSSFRow headerRow = sheet.getRow(0);
	int colCount = headerRow.getLastCellNum();
	String[][] array = new String[rowCount][colCount];
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < colCount; j++) {
			XSSFCell cell = row.getCell(j);
			String data = cell.getStringCellValue();
			array[i-1][j] = data;
			System.out.println(data);
		}
	}
	book.close();
	return array;	
	
}
}
