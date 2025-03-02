package org.step_Definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page_object.SearchPageObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartProductSearch extends BaseClass {

	static int count=0;
	
	
	@BeforeClass
	public void beforeClass() throws Exception {
		System.out.println("BeforeClass");
		launchBrowser("chrome");
		maximize();
		implicitWait(10);
		launchURL("https://www.flipkart.com/");
      
      
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("AfterClass");
		
		//driver.quit();
}
	
	@BeforeMethod
	public  void beforeMethod() {
		System.out.println("beforemethod");


	}
	
	@AfterMethod
	public  void afterMethod() {
		System.out.println("aftermethod");

	}
	
	@Test
	public void test1() throws AWTException, InterruptedException {
		SearchPageObject so = new SearchPageObject();
		sendKeys(so.getSearchBox(),"iphone15plus");
		Thread.sleep(3000);
		Robot r = new Robot ();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		for (int i = 0; i < 5; i++) {
			
			if(i==0) {
				List<WebElement> products = so.getProducts();
				
				for (WebElement webElement : products) {
					count=count+1;
					System.out.println(getText(webElement));
				}
			}
			else {
				click(so.getNextBtn());
				Thread.sleep(4000);
        List<WebElement> products = so.getProducts();
				
				for (WebElement webElement : products) {
					count=count+1;
					System.out.println(getText(webElement));
				}
			}
			}
		System.out.println("TotalProduct : "+count);
	}
	
}
