package org.selenium_task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter56 {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\sasik\\eclipse-workspace\\Project_FaceBook_15_02_25\\src\\test\\resources\\Adactin_Configfdd.xlsx");
		
		FileInputStream fileIn = new FileInputStream(file);
		
	     Workbook workbook = new XSSFWorkbook(fileIn);
		
	     
	     Sheet sheetAt = workbook.getSheetAt(0);
	     
	     Row row = sheetAt.getRow(3);
	     
	     Cell cell = row.createCell(5);
	     
	     cell.setCellValue("sasikumar");
	     
	     
	     FileOutputStream fout = new FileOutputStream(file);
	     workbook.write(fout);
	     
	}
	
}
