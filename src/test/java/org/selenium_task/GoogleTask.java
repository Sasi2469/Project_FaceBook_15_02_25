package org.selenium_task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTask {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/"); 
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("software testing");
		Thread.sleep(4000);
	
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for (WebElement webElement : allsuggestions) {
			System.out.println(webElement.getText());
		}
		
		for (int i = 0; i < allsuggestions.size(); i++) {
			
			if (i==1) {
				Thread.sleep(4000);
				allsuggestions.get(i).click();
			}
		}
		Thread.sleep(4000);
		System.out.println("Title of the Page: "+driver.getTitle());
		List<WebElement> linktitles = driver.findElements(By.xpath("//div[@class='CA5RN']//span[@class='VuuXrf']"));
		
		System.out.println("Link Titles: ");
		for (WebElement title : linktitles) {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor)driver ;
			js.executeScript("arguments[0].scrollIntoView(true)", title );
			Thread.sleep(3000);
			System.out.println(title.getText());
			
		}
		
	}
	
	
}
