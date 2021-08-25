package com.myTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.mypages.BasePage;
import com.mypages.PageGrandParent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	public PageGrandParent page;
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUpTest(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup(); // if you have webDriver manager

			//System.setProperty("webdriver.chrome.driver","C:\\Users\\ancha\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
			driver = new ChromeDriver();		
		}else if(browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Please provide available driver...");
		}
		
		driver.get("https://mail.google.com");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Important concept 
		/** To distribute this driver to all the classes, we have to supply this drive to the PageGrandParent constructor 
		 * as we can not create the object of PageGrandParent class as it's an abstract class, but we can supply it through it's child class i.e BasePage class  
		 * otherwise nullpointer will come */
		
		page = new BasePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
