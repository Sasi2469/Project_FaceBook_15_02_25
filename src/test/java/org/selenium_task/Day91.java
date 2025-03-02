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

public class Day91 {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/"); 
		Thread.sleep(10000);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("iphone15",Keys.ENTER);

		WebElement product1 =driver.findElement(By.xpath("//div[@data-cy='title-recipe']//span[text()='Apple iPhone 15, 128GB, Green for Cricket Wireless (Renewed)']"));

		Actions action = new Actions(driver);
		 action.moveToElement(product1).build().perform();
		Thread.sleep(3000);
		action.contextClick(product1).build().perform();

	

		Robot robo = new Robot();

		for(int i=0; i<2; i++){
		robo.keyPress(KeyEvent.VK_DOWN);

		robo.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_ENTER);

		robo.keyRelease(KeyEvent.VK_ENTER);

		Set<String> allId = driver.getWindowHandles();
System.out.println(allId);
		int count = 0 ;

		for(String id : allId){
		  
		   if(count==1){
		        driver.switchTo().window(id);
		}
		   count=count+1;
		   }
		WebElement findElement = driver.findElement(By.xpath("//div[@id='title_feature_div']"));
		System.out.println(findElement.getText());



	}
}
