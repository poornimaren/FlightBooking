package org.project.task3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class BlazeDemoPojo_1 {
	
	WebDriver driver;
	
	public BlazeDemoPojo_1(WebDriver driver1) {
		this.driver = driver1;
	}
	
	
	@FindAll({
		@FindBy(className = "form-inline"),
		@FindBy(name = "fromPort")
		
	})
	private WebElement drpdwnFrom;
	
	@FindBy(name = "toPort")
	private WebElement drpdwnTo;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement btnFindFlights;
	
	@FindBy(xpath = "//table[@class='table']")
	private WebElement table;
	
	@FindBy(tagName = "td")
	private WebElement tdTag;
	
	@FindBy(xpath = "//input[@class='btn btn-small']")
	private WebElement btnChooseFlight;
	
	@FindBy(xpath = "//input[@name='price']")
	private WebElement price;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDrpdwnFrom() {
		return drpdwnFrom;
	}

	public WebElement getDrpdwnTo() {
		return drpdwnTo;
	}

	public WebElement getBtnFindFlights() {
		return btnFindFlights;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getTdTag() {
		return tdTag;
	}

	public WebElement getBtnChooseFlight() {
		return btnChooseFlight;
	}

	public WebElement getPrice() {
		return price;
	}
	
	
	
	
	
	

}
