package test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//span[text()='From']")).click();
	     WebElement from =driver.findElement(By.xpath("//input[@placeholder='From']"));
	   
	     from.sendKeys("pune");
	     Thread.sleep(3000);

	     from.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(3000);

	     from.sendKeys(Keys.ENTER);
	     Thread.sleep(3000);

	   
	     
	     
	     
	     
	     
	}

}
