package org.selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.swiggy.com/");		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	
		
		driver.findElement(By.xpath("//a[text()='create an account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("mobile")).sendKeys("8248415797");
		
		driver.findElement(By.id("name")).sendKeys("sasi");
		
		driver.findElement(By.id("email")).sendKeys("sadh$hdjdj");
		
		driver.findElement(By.xpath("//a[@class='lyOGZ']")).click();
	}
	
}
