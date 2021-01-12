package org.project.task3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flight_BlazeDemo {
	@Parameters({ "name", "address", "city", "state", "zipCode", "cardType", "cardNo", "month", "year", "cardName" })
	@Test
	public void tc1(String name, String address, String city, String state, String zipCode, String cardType,
			String cardNo, String month, String year, String cardName) throws InterruptedException {
		LibGlobal l = new LibGlobal();
		WebDriver driver = l.browserLaunch();
		l.getURL(driver, "https://blazedemo.com/");

		BlazeDemoPojo_1 b = new BlazeDemoPojo_1(driver);
		PageFactory.initElements(driver, b);
		l.selectByIndex(b.getDrpdwnFrom(), 0);
		l.selectByValue(b.getDrpdwnTo(), "London");
		l.click(b.getBtnFindFlights());

		WebElement table = driver.findElement(By.className("table"));
		List<WebElement> btnChooseFlight = driver.findElements(By.xpath("//input[@value='Choose This Flight']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));

		List<WebElement> price = driver.findElements(By.name("price"));

		Set<Double> s = new TreeSet<Double>();

		for (int i = 0; i < price.size(); i++) {
			WebElement prices = price.get(i);
			String priceValue = prices.getAttribute("value");
			double priced = Double.parseDouble(priceValue);
			s.add(priced);
		}
		List<Double> flight_prices = new ArrayList<Double>(s);
		double low_price = flight_prices.get(0);
		String priceStr = String.valueOf(low_price);

		for (int i = 0; i < btnChooseFlight.size(); i++) {
			WebElement prices = price.get(i);
			String priceValue2 = prices.getAttribute("value");
			double priceValued = Double.parseDouble(priceValue2);
			// if (priceValued == low_price) {
			// btnChooseFlight.get(i).click();
			// break;
			// }

			if (priceStr.equals(priceValue2)) {
				btnChooseFlight.get(i).click();
				break;
			}
		}

		BlazeInputPojo p = new BlazeInputPojo(driver);
		PageFactory.initElements(driver, p);

		l.enterVal(p.getTxtName(), name);
		l.enterVal(p.getTxtAddress(), address);
		l.enterVal(p.getTxtCity(), city);
		l.enterVal(p.getTxtState(), state);
		l.enterVal(p.getTxtZipCode(), zipCode);
		l.selectByVisibTxt(p.getDrpdwnCardType(), cardType);
		l.enterVal(p.getTxtCardNo(), cardNo);
		l.clear(p.getTxtMonth());
		l.enterVal(p.getTxtMonth(), month);
		l.clear(p.getTxtYear());
		l.enterVal(p.getTxtYear(), year);
		l.enterVal(p.getTxtCardName(), cardName);

		l.click(p.getBtnPurchase());

		String text = l.getText(p.getConfirMsg());
		System.out.println(text);

		WebElement table2 = driver.findElement(By.className("table"));
		List<WebElement> rows2 = table2.findElements(By.tagName("tr"));

		for (int j = 0; j < rows2.size(); j++) {
			WebElement r = rows2.get(j);
			String text1 = r.getText();
			System.out.println(text1);

		}
		l.close(driver);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");


	}
}
