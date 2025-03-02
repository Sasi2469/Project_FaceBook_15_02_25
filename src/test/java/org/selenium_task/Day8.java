package org.selenium_task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8 {
	
	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://demo.automationtesting.in/Alerts.html");
//
//		driver.manage().window().maximize();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//
//		Alert alert = driver.switchTo().alert();
//		
//		alert.accept();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
//		Thread.sleep(3000);
//
//		
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//		Thread.sleep(3000);
//		Alert alert2 = driver.switchTo().alert();
//		
//		alert2.sendKeys("sasikumar");
//		Thread.sleep(2000);
//		
//		alert2.accept();
		
//		WebDriverManager.chromedriver().setup();
//		
//		
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://ui.vision/demo/webtest/frames/");
//		
//		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//
//		driver.switchTo().frame(frame1);
//
//		WebElement textbox1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
//
//		textbox1.sendKeys("Testing");
//
//		driver.switchTo().parentFrame();

		

WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/automation-practice-form/");
driver.manage().window().maximize();
//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//
//driver.switchTo().frame(frame1);
//
//WebElement textbox1 = driver.findElement(By.xpath("//input[@name='mytext1']"));
//
//textbox1.sendKeys("Testing");
//
//driver.switchTo().parentFrame();
//
//
//
//
//WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
//driver.switchTo().frame(frame2);
//   
//
//WebElement textbox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
//
//textbox2.sendKeys("java");
//
//driver.switchTo().parentFrame();
//
//
//WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//driver.switchTo().frame(frame3);
//
//WebElement textbox3 = driver.findElement(By.xpath("//input[@name='mytext3']"));
//
//textbox3.sendKeys("java");
//
//
//WebElement iframe = driver.findElement(By.xpath("//iframe[@width='650']"));
//
//driver.switchTo().frame(iframe);
//
//
//
//WebElement radiobutton = driver.findElement(By.xpath("(//div[@class='vd3tt'])[1]"));
//
//radiobutton.click();
//
//
//
//
//Thread.sleep(3000);
//
//driver.switchTo().parentFrame();
//Thread.sleep(3000);
//driver.switchTo().parentFrame();
//Thread.sleep(3000);
//WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
//driver.switchTo().frame(frame4);
//
//WebElement textbox4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
//
//textbox4.sendKeys("javaerrt");
	

WebElement findElement = driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[1]"));

JavascriptExecutor js = (JavascriptExecutor)driver ;
js.executeScript("arguments[0].scrollIntoView('true')", findElement);


Thread.sleep(3000);
findElement.click();
Thread.sleep(3000);

driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();


	}

}
