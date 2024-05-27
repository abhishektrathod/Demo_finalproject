package test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation_Prrogram {

	public static void main(String[] args) throws InterruptedException {
     
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://login.salesforce.com/");
		
		Thread.sleep(3000);
		
		

		
	
	
	
	
	
	
	}

}
