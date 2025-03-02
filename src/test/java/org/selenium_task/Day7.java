package org.selenium_task;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7 {

	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get(" http://www.greenstechnologys.com/");		
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebElement recentArticles = driver.findElement(By.xpath("//a[contains(text(),'Latest Articles')]"));
//		
//		JavascriptExecutor javascript = (JavascriptExecutor)driver;
//
//		javascript.executeScript("arguments[0].scrollIntoView(true)",recentArticles);	
		
		

//WebElement perumbakkam=driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
//
//JavascriptExecutor js = (JavascriptExecutor)driver;
//
//js.executeScript("arguments[0].scrollIntoView(true)",perumbakkam);
//
//TakesScreenshot screenshot = (TakesScreenshot)driver;
//
//File src =perumbakkam.getScreenshotAs(OutputType.FILE);
//
//File des = new File("img.jpg");
//
//FileUtils.copyFile(src,des);
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);

	List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']"));

		    for(WebElement mobile : findElements){
		             System.out.println(mobile.getText());
		}		
		    List<WebElement> prices = driver.findElements(By.xpath(" //div[@class='a-section a-spacing-small a-spacing-top-small']//div[@data-cy='price-recipe']//span[@class='a-price-whole']"));

		    for(WebElement mobileprices : prices){
		             System.out.println(mobileprices.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	
}
