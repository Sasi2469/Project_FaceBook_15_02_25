package org.selenium_task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day9 {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php"); 

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement countries = driver.findElement(By.xpath("//select[@name='country']"));

		Select select = new Select(countries);

		List<WebElement> options = select.getOptions();

             
		for(int i=0; i< options.size() ; i++){
		      if(i%2 == 0){
		            
		    	  select.selectByVisibleText(options.get(i).getText());
		    	  System.out.println(options.get(i).getText());
		}             

		}
	}
}
