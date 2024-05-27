package testNG_Examples;

import org.testng.annotations.Test;

public class DependsON_MethodsEx {
	
		@Test
		public void driverinitialize()
		{
			System.out.println("Code to initialize the browser");
		}
		
		@Test(dependsOnMethods = "driverinitialize")
		public void enterURL()
		{
			System.out.println("Code to launch the browser");
		}

}
