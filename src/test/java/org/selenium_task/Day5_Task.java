package org.selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5_Task {

	public static void main(String[] args) throws InterruptedException {
		
	
WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");		
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//	WebElement course = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
//	Thread.sleep(3000);
//	Actions s = new Actions(driver);
//	
//	s.moveToElement(course).build().perform();
//	Thread.sleep(3000);
//		WebElement RPA = driver.findElement(By.xpath("(//div[@class='tonclickopen main-cat menu-item'])[4]"));
//			s.moveToElement(RPA).build().perform();
//			
//			
//			Thread.sleep(3000);
//			WebElement automation = driver.findElement(By.xpath("//span[contains(text(),'Automation Anywhere')]"));
//			
//			automation.click();
			
			WebElement electronics = driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[2]"));
			
			Actions s = new Actions(driver);
					s.moveToElement(electronics).build().perform();
		Thread.sleep(3000);
			
		WebElement gaming = driver.findElement(By.xpath("(//a[@class='_1BJVlg'])[4]"));
		
			
		
		s.moveToElement(gaming).build().perform();
Thread.sleep(3000);
			

			
WebElement gamingkeypads = driver.findElement(By.xpath("//a[contains(text(),'Gamepads')]"));


gamingkeypads.click();

			
			
			
			
			
			
}
}