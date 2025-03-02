package org.selenium_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {

public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.flipkart.com");		
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
//	WebElement user = driver.findElement(By.cssSelector("#username"));
//	user.sendKeys("sasikumar");
//	WebElement pass = driver.findElement(By.cssSelector("#password"));
//	pass.sendKeys("kumar#53633");
//	
//	String att1 = user.getAttribute("value");
//	
//	String att2 = pass.getAttribute("value");
//	
//	
//	System.out.println(att1  + att2 );
	
//	WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//	
//	WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
//	
//	WebElement amount1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
//	
//	WebElement amount2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
//	
//	
//	
//	Actions s = new Actions(driver);
//	
//	s.dragAndDrop(bank, driver.findElement(By.xpath("//ol[@id='bank']"))).perform();
//	
//	s.dragAndDrop(sales, driver.findElement(By.xpath("//ol[@id='loan']"))).perform();
//	
//	s.dragAndDrop(amount1, driver.findElement(By.xpath("//ol[@id='amt7']"))).perform();
//	
//	s.dragAndDrop(amount2, driver.findElement(By.xpath("//ol[@id='amt8']"))).perform();
//	
	
	                                                //div[@class='_1wE2Px']
	Thread.sleep(10000);
	
	WebElement mouse = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[5]"));
	Actions s = new Actions(driver);
	s.moveToElement(mouse).build().perform();
	Thread.sleep(7000);
	
	WebElement furni = driver.findElement(By.xpath("(//a[@class='_1BJVlg'])[4]"));
	Actions s1 = new Actions(driver);
	s1.moveToElement(furni).perform();
		Thread.sleep(7000);
	WebElement sidetable = driver.findElement(By.xpath("(//a[@class='_3490ry'])[4]"));
	Actions s12 = new Actions(driver);
	s12.moveToElement(sidetable).perform();
	System.out.println(sidetable.getText());
	
}
	
	
}
