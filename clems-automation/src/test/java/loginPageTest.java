import org.testng.annotations.Test;

import com.qa.clems.pages.PageParent;
import com.qa.clems.pages.loginPage;

public class loginPageTest extends ClemsBaseTest {
	@Test
	public void LogInTest() {
		pageParent.getInstance(loginPage.class).doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
}
