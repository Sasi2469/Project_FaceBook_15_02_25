package org.page_object;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageObject extends BaseClass{

	
	public SearchPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSearchBox() {
		return searchBox;
	}



	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}



	public List<WebElement> getProducts() {
		return products;
	}



	public void setProducts(List<WebElement> products) {
		this.products = products;
	}



	public WebElement getNextBtn() {
		return nextBtn;
	}



	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}



	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox;
	
	
	
	@FindBy(className="KzDlHZ")
      private List<WebElement> products;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
    private WebElement nextBtn;
	
	
	
	
}
