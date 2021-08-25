package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By header = By.xpath("//a[@class='gb_ke gb_pc gb_ie']");
	
	// getters
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getHomePageHeader() {
		return getPageHeader(header);
		
	}
	public String getHomePageTitle() {
		return getPageTitle();
		
	}

}
