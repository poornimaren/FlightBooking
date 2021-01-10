package org.project.task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class BlazeInputPojo {
	
WebDriver driver;
	
	public BlazeInputPojo(WebDriver driver1) {
		this.driver = driver1;
	}
	
	@FindBy(xpath = "//input[@name='inputName']")
	private WebElement txtName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "city")
	private WebElement txtCity;
	
	@FindBy(id = "state")
	private WebElement txtState;
	
	@FindBy(id = "zipCode")
	private WebElement txtZipCode;
	
	@FindBy(id = "cardType")
	private WebElement drpdwnCardType;
	
	@FindBy(id = "creditCardNumber")
	private WebElement txtCardNo;
	
	@FindBy(id = "creditCardMonth")
	private WebElement txtMonth;
	
	@FindBy(id = "creditCardYear")
	private WebElement txtYear;
	
	@FindBy(id = "nameOnCard")
	private WebElement txtCardName;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement btnPurchase;
	
	@FindBy(xpath = "//table[@class='table']")
	private WebElement table;
	
	@FindBy(tagName = "td")
	private WebElement tdTag;
	
	@FindBy(tagName = "tr")
	private WebElement trTag;
	
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	private WebElement confirMsg;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getDrpdwnCardType() {
		return drpdwnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtMonth() {
		return txtMonth;
	}

	public WebElement getTxtYear() {
		return txtYear;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getBtnPurchase() {
		return btnPurchase;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getTdTag() {
		return tdTag;
	}

	public WebElement getTrTag() {
		return trTag;
	}
	
	public WebElement getConfirMsg() {
		return confirMsg;
	}
	
	
	
	
	

}
