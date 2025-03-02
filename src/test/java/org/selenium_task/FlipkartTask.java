package org.selenium_task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTask {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/"); 
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone15");
		
		List<WebElement> autoSugProducts = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//div[@class='YGcVZO _2VHNef']"));
		
		System.out.println("products from auto suggestion:");
		
		for (WebElement webElement : autoSugProducts) {
			System.out.println(webElement.getText());
		}
		
		System.out.println(" ");
		
		for (int i = 0; i <autoSugProducts.size(); i++) {
			
			if(i==2) {
				autoSugProducts.get(i).click();
				System.out.println("3rd product page: "+driver.getTitle());
			}
		}
		
	}

	
	
	

}
