package org.selenium_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6 {

	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
//		WebElement electronics = driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[2]"));
//		
//		Actions s = new Actions(driver);
//				s.moveToElement(electronics).build().perform();
//	Thread.sleep(3000);
//	s.contextClick(electronics).build().perform();
//	Robot r = new Robot();
//	
//	
//	for (int i = 0; i < 3; i++) {
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//	}
//	
//	Thread.sleep(4000);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
//Thread.sleep(4000);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	}
//	
	
//	
//	driver.findElement(By.xpath("//h2[contains(text(),'Selenium Test Papers')]")).click();
//	
//	WebElement day6 = driver.findElement(By.xpath("(//a[contains(text(),' DAY 6 TASK')])[2]"));
//	
//	Actions a = new Actions(driver);
//	a.contextClick(day6).build().perform();
//	
//	Thread.sleep(4000);
//	
//	
//	Robot r = new Robot();
//	for (int i = 0; i < 6; i++) {
//		
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//	}
//	
//	
//	Thread.sleep(4000);
//	
//	r.keyPress(KeyEvent.VK_ENTER);
//	r.keyRelease(KeyEvent.VK_ENTER);
//	
	
//	WebElement seacrh = driver.findElement(By.id("APjFqb"));
//	seacrh.sendKeys("sasikumar");
//	
//	Actions a = new Actions (driver);
//	
//	a.doubleClick(seacrh).build().perform();
//	
//	
//	Robot r = new Robot();
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_X);
//	Thread.sleep(3000);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_X);
//	
//	
	
	driver.findElement(By.xpath("(//input[@name='keyword'])[1]")).sendKeys("HP Laptop");
	
	driver.findElement(By.className("searchTextSpan")).click();
	
	TakesScreenshot screenshot = (TakesScreenshot)driver;
	

File src = screenshot.getScreenshotAs(OutputType.FILE);

File des = new File("C:\\Users\\sasik\\eclipse-workspace\\Project_FaceBook_15_02_25\\screenshot\\img.jpg");

FileUtils.copyFile(src,des);
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
