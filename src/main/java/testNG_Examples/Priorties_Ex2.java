package testNG_Examples;

import org.testng.annotations.Test;

public class Priorties_Ex2 {
	
	@Test(priority = 'a')//runs second
	public void driverinitialize()
	{
		System.out.println("Code to initialize the browser");
	}
	@Test(priority = 'A')//THis will runs first
	public void enterURL()
	{
		System.out.println("Code to launch the browser");
	}
	@Test(priority = 'c')
	public void entercredential()//runs third
	{
		System.out.println("Code to enter credential");
	}
}
