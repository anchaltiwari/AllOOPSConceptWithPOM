import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerDemo.testNGListener.class)
public class TestNgListenerTest extends ClemsBaseTest {
	@Test
	public void testFirst() {
		driver.getTitle();
	}
}
