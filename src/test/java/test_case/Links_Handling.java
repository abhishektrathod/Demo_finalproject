package test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Use Custom")).click();
		
	}

}
