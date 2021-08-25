import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.clems.pages.PageParent;

public class ClemsBaseTest {
	public static Properties prop;
	public WebDriver driver;
	public WebDriverWait wait;
	public PageParent pageParent;
	@BeforeMethod
	public void setUp() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Lab\\WorkspaceTest1\\clems-automation\\src\\main\\resources\\config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName = prop.getProperty("browser"); 
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ancha\\Downloads\\chromedriver_win32 (7)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else {
			System.out.println("Please provide available driver...");
		}
		
		wait = new WebDriverWait(driver,60);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		// create object of PageParent
		pageParent = new PageParent(driver,wait);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
