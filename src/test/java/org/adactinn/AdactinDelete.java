package org.adactinn;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.base.BaseClass;
import org.bouncycastle.operator.AADProcessor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.page_object.AdactinPageObject;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.xml.LaunchSuite;

public class AdactinDelete  extends BaseClass{
int count1 = 0;
int count2 = 0;
	@BeforeClass
	public  void beforClass() {
		
		launchBrowser("chrome");
		maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		implicitWait(10);
	System.out.println(this.getClass().getName()+ "Validation started ");

	}
	
	@AfterClass
	public void Afterclass() {
		
		System.out.println(this.getClass().getName()+ "Validation Ended ");
	//	driver.quit();

	}
	
	@BeforeMethod
	public  void beforeMethod() {
		count1++;
		System.out.println("Test case "+count1+ ": Execution started ");
		

	}
	
	@AfterMethod
	public  void afterMethod() {
		count2++;
		System.out.println("Test case "+count2+ ": Execution ended ");

	}
	
	@Test
	public  void Test1() throws IOException {
	      
		AdactinPageObject ad = new AdactinPageObject();
                sendKeys(ad.getUsername(), propertyReader("username"));
                
                sendKeys(ad.getPassword(), propertyReader("password"));
                
                
                String usernameValue = ad.getUsername().getAttribute("value");
                
                Assert.assertEquals(usernameValue, propertyReader("username"), "user name"+usernameValue+"is correct");
                
                
                click(ad.getLoginBtn());
                
                if(driver.getCurrentUrl().equals("https://adactinhotelapp.com/HotelAppBuild2/SearchHotel.php")) {
                	System.out.println("Login successfull");
                }
  }
	
	
	@Test
	public void Test2() {
		AdactinPageObject ad = new AdactinPageObject();

		selectByVisisbleText(ad.getLocation(), "Melbourne");
		
		selectByVisisbleText(ad.getHotel(), "Hotel Hervey");
		
		selectByVisisbleText(ad.getRoomType(),"Standard");
		
		selectByVisisbleText(ad.getRoomNos(), "4 - Four");
		
		sendKeys(ad.getCheckinDate(), "24/05/2025");

		sendKeys(ad.getCheckoutDate(), "27/05/2025");
		
		selectByVisisbleText(ad.getAdultPerRoom(), "3 - Three");
		
		selectByVisisbleText(ad.getChildPerRoom(), "2 - Two");
		
		click(ad.getSubmitBtn());
		
		if (driver.getCurrentUrl().equals("https://adactinhotelapp.com/HotelAppBuild2/SelectHotel.php")) {
			System.out.println("Hotel searched successfully");
		}
		
		
	}
	
	
	@Test
	public  void Test3() {
		AdactinPageObject ad = new AdactinPageObject();
		click(ad.getRadioButton());
click(ad.getContinuebtn());

if (driver.getCurrentUrl().equals("https://adactinhotelapp.com/HotelAppBuild2/BookHotel.php")) {
	System.out.println("Holet selected successfully");
}

	}
	
	@Test
	public  void Test4() throws IOException, InterruptedException {
		AdactinPageObject ad = new AdactinPageObject();
	sendKeys(ad.getFirstName(), propertyReader("firstname"));
	
	sendKeys(ad.getLastName(), propertyReader("lastname"));
	
	sendKeys(ad.getAddress(), propertyReader("address"));
	
	sendKeys(ad.getCreditCardNo(), propertyReader("creditcardno"));
	
	selectByVisisbleText(ad.getCreditCardType(), propertyReader("creditcardtype"));
	
	selectByVisisbleText(ad.getCcExpiryMonth(), "June");
	
	selectByVisisbleText(ad.getCcExpiryYear(), "2028");
	
	sendKeys(ad.getCvvNo(),"748");
	
	click(ad.getBookNowBtn());
	
	Thread.sleep(6000);
	if (driver.getCurrentUrl().equals("https://adactinhotelapp.com/HotelAppBuild2/BookingConfirm.php")) {
		System.out.println("hotel booked successfully");
		
	}
	}


	@Test
	public  void Test5() throws IOException, InterruptedException {

		AdactinPageObject ad = new AdactinPageObject();

		
	      String OrderNo = ad.getOrderNo().getAttribute("value");
	      System.out.println(OrderNo);
	      click(ad.getIteraryBtn());
	      
	     sendKeys(ad.getOrderIdSearch(), OrderNo);
           
	     Thread.sleep(3000);

	     click(ad.getOrderIdGo());
	     Thread.sleep(3000);
	     click(ad.getCheckAllBtn());
	     Thread.sleep(3000);

	     click(ad.getCancelSelectedBtn());
	     
	     Alert alert = driver.switchTo().alert();
	     alert.accept();
	     
	     
	     List<WebElement> datas = driver.findElements(By.xpath("//table[@cellpadding='5']//tr//td[2]"));
	     
	     List<String> orderIds = new ArrayList<String>();
	     
	     for (WebElement data : datas) {
	    	 orderIds.add(data.getText());
		}
	     
	  if(orderIds.contains(OrderNo)) {
		  
		  System.out.println("orderid not deleted");
	  }
	  
	  else {
		System.out.println("Order No "+OrderNo+ " Deleted");
	}
	     
	}


//@Test(dataProvider= "URL", dataProviderClass=DataProviderry.class)
//public void test6(String firstname,String lastname, String email, String password) {
//System.out.println("fName "+firstname);
//System.out.println("lName "+lastname);
//System.out.println("email "+ email);
//	System.out.println("password "+ password);
//}
















}
