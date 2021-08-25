package runner;


import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class testNgRunner {

	public static void main(String[] args) {
		TestNG test = new TestNG();
		List<String> list = new ArrayList<String>();
		list.add("C:\\Lab\\WorkspaceTest1\\clems-automation\\test-output\\testng-failed.xml");
		test.setTestSuites(list);
		test.run();
	}

}
