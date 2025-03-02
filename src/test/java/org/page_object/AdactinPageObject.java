package org.page_object;

import org.adactinn.AdactinDelete;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPageObject extends AdactinDelete {
	
	public AdactinPageObject() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username ;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
		
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(WebElement radioButton) {
		this.radioButton = radioButton;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public void setContinuebtn(WebElement continuebtn) {
		this.continuebtn = continuebtn;
	}


	@FindBy(id="radiobutton_0")
	  private WebElement radioButton ;
	
	
	@FindBy(id="continue")
	  private WebElement continuebtn ;
	
	@FindBy(xpath="//select[@id='location']")
	  private WebElement location ;
	
	@FindAll({@FindBy(id="hotels") , @FindBy(xpath="//select[@name='hotels']")})
	private WebElement hotel ;
	
	@FindBy(id="room_type")
	  private WebElement roomType ;
	
	@FindBy(id="room_nos")
	  private WebElement roomNos ;
	
	@FindBy(id="datepick_in")
	  private WebElement checkinDate ;
	
	@FindBy(id="datepick_out")
	  private WebElement checkoutDate ;
	
	@FindBy(id="adult_room")
	  private WebElement adultPerRoom ;
	
	@FindBy(id="child_room")
	  private WebElement childPerRoom ;
	
	@FindBy(id="Submit")
	  private WebElement submitBtn ;
	
	@FindBy(id="Reset")
	  private WebElement resetBtn ;
	
	
	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public void setRoomNos(WebElement roomNos) {
		this.roomNos = roomNos;
	}




	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(WebElement checkinDate) {
		this.checkinDate = checkinDate;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(WebElement checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public WebElement getAdultPerRoom() {
		return adultPerRoom;
	}

	public void setAdultPerRoom(WebElement adultPerRoom) {
		this.adultPerRoom = adultPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public void setChildPerRoom(WebElement childPerRoom) {
		this.childPerRoom = childPerRoom;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public void setResetBtn(WebElement resetBtn) {
		this.resetBtn = resetBtn;
	}
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(WebElement creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(WebElement creditCardType) {
		this.creditCardType = creditCardType;
	}

	public WebElement getCcExpiryMonth() {
		return ccExpiryMonth;
	}

	public void setCcExpiryMonth(WebElement ccExpiryMonth) {
		this.ccExpiryMonth = ccExpiryMonth;
	}

	public WebElement getCcExpiryYear() {
		return ccExpiryYear;
	}

	public void setCcExpiryYear(WebElement ccExpiryYear) {
		this.ccExpiryYear = ccExpiryYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(WebElement cvvNo) {
		this.cvvNo = cvvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	public void setBookNowBtn(WebElement bookNowBtn) {
		this.bookNowBtn = bookNowBtn;
	}


	@FindBy(id ="first_name")
	private WebElement firstName ;
	
	@FindBy(id ="last_name")
	private WebElement lastName ;
	
	@FindBy(id ="address")
	private WebElement address ;
	
	@FindBy(id ="cc_num")
	private WebElement creditCardNo ;
	
	@FindBy(id ="cc_type")
	private WebElement creditCardType ;
	
	@FindBy(id ="cc_exp_month")
	private WebElement ccExpiryMonth ;
	
	@FindBy(id ="cc_exp_year")
	private WebElement ccExpiryYear ;
	
	@FindBy(id ="cc_cvv")
	private WebElement cvvNo ;
	
	@FindBy(id ="book_now")
	private WebElement bookNowBtn ;
	
	
	@FindBy(xpath ="//input[@name='order_no']")
	private WebElement orderNo ;


	public WebElement getOrderNo() {
		return orderNo;
	}


	public void setOrderNo(WebElement orderNo) {
		this.orderNo = orderNo;
	}

	
	@FindBy(xpath ="//input[@name='my_itinerary']")
	private WebElement iteraryBtn ;

	public WebElement getIteraryBtn() {
		return iteraryBtn;
	}

	public WebElement getOrderIdSearch() {
		return orderIdSearch;
	}

	public void setOrderIdSearch(WebElement orderIdSearch) {
		this.orderIdSearch = orderIdSearch;
	}

	public WebElement getOrderIdGo() {
		return orderIdGo;
	}

	public void setOrderIdGo(WebElement orderIdGo) {
		this.orderIdGo = orderIdGo;
	}

	public WebElement getCheckAllBtn() {
		return checkAllBtn;
	}

	public void setCheckAllBtn(WebElement checkAllBtn) {
		this.checkAllBtn = checkAllBtn;
	}

	public WebElement getCancelSelectedBtn() {
		return cancelSelectedBtn;
	}

	public void setCancelSelectedBtn(WebElement cancelSelectedBtn) {
		this.cancelSelectedBtn = cancelSelectedBtn;
	}

	public void setIteraryBtn(WebElement iteraryBtn) {
		this.iteraryBtn = iteraryBtn;
	}


	@FindBy(xpath ="//input[@id='order_id_text']")
	private WebElement orderIdSearch ;
	
	
	@FindBy(xpath ="//input[@id='search_hotel_id']")
	private WebElement orderIdGo ;
	
	@FindBy(xpath ="//input[@id='check_all']")
	private WebElement checkAllBtn ;
	
	@FindBy(xpath ="//input[@name='cancelall']")
	private WebElement cancelSelectedBtn ;
	
	
	
	

	
	
}
