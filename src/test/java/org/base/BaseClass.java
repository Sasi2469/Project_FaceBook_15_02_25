package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hpsf.Property;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver ;
	
	public static void launchBrowser(String browser) {
		
		switch(browser) {
		
		case "chrome" :	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "firefox" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		default:
			System.out.println("invalid browser");
		}
	}
	
	
	public static void maximize() {
                      driver.manage().window().maximize();
	}
	
	
	public static void implicitWait(int time) {
                  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void launchURL(String url) {
		driver.get(url);

	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}
	
	public static String getText(WebElement element) {
	       String text = element.getText();
		return text;

	}
	
	public static String propertyReader(String key) throws IOException {
		File f = new File("C:\\Users\\sasik\\eclipse-workspace\\Project_FaceBook_15_02_25\\src\\test\\resources\\url.properties");
		
		FileReader fr = new FileReader(f);
        
		Properties p = new Properties();
		p.load(fr);
		 
		String property = p.getProperty(key);
		return property;
	
	          
	
	}
	
	public static  String excelReader(int sheetNo , int rowNo, int cellNo ) throws IOException {
		
		File f = new File("C:\\Users\\sasik\\eclipse-workspace\\Project_FaceBook_15_02_25\\src\\test\\resources\\Adactin_Configfdd.xlsx");
		
FileInputStream fileIn = new FileInputStream(f);

                    Workbook workbook = new XSSFWorkbook(fileIn);
                       Sheet sheetAt = workbook.getSheetAt(sheetNo);
                Row row =       sheetAt.getRow(rowNo);
                
            Cell cell=    row.getCell(cellNo);
                               int cellType = cell.getCellType();
                               
                           //    cell type = text=0,   date = 0, numeric = 1
                               
                               
                               if(cellType==1) {
                            	   double numericCellValue = cell.getNumericCellValue();
                            	   String value = String.valueOf(numericCellValue);
                            	   
                            	   return value;
                               }
                               else if (DateUtil.isCellDateFormatted(cell)) {
								
                            	   Date dateCellValue = cell.getDateCellValue();
                            	   SimpleDateFormat date = new SimpleDateFormat("dd//mm/yyyy");
                            	    String value = date.format(dateCellValue);
                            	    return value;
							}
                               else {
								String value = cell.getStringCellValue();
								return value;
							}
	}
	

	
	public static void selectByVisisbleText(WebElement e, String text) {
		
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

