package testNG_Examples;

import org.testng.annotations.Test;

public class Priorties_Ex1 {
	@Test(priority = 1)
	public void driverinitialize()
	{
		System.out.println("Code to initialize the browser");
	}
	@Test(priority = 2)
	public void enterURL()
	{
		System.out.println("Code to launch the browser");
	}
	@Test(priority = 3)
	public void entercredential()
	{
		System.out.println("Code to enter credential");
	}
	@Test(priority = 4)
	public void driverClosing()
	{
		System.out.println("Code to close the driver");
	}
}
