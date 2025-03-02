package org.selenium_task;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTask {

	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/"); 

		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
//	driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
//		WebElement until = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Flipkart']"))));
		
		driver.findElement(By.xpath("//input[@id='timerButton']")).click();
		
		Alert until2 = wait.until(ExpectedConditions.alertIsPresent());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='timerButton']")));
		until2.accept();

	//
		
	
	FluentWait<WebDriver> wait2 = new 	FluentWait<WebDriver> (driver)
			                            .withTimeout(50,TimeUnit.SECONDS)
			                            .pollingEvery(10,TimeUnit.SECONDS)
			                            .ignoring(Throwable.class);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
