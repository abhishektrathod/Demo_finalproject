package testNG_Examples;

import org.testng.annotations.Test;

public class Enabled_Ex3 {
	@Test(enabled = false)
	public void driverinitialize()
	{
		System.out.println("Code to initialize the browser");
	}
	@Test(enabled = true)//this runs only
	public void enterURL()
	{
		System.out.println("Code to launch the browser");
	}

}
