package org.selenium_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task34 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.trainingintambaram.net/selenium-training-in-chennai/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[contains(text(),'X')]")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//strong[contains(text(),'Day – 10 Task')]")).click();

		Set<String> allId = driver.getWindowHandles();

		   int count = 0;
		for(String id : allId){
		       count=count+1;
		   if(count ==2){
		driver.switchTo().window(id);
		}

		}

		System.out.println(driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")).getText());


	}
}
