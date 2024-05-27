package test_case;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement alertButton=driver.findElement(By.id("alertbtn"));
	     alertButton.click();
	     Thread.sleep(3000);
	     System.out.println(driver.switchTo().alert().getText());
	     driver.switchTo().alert().accept();

	}

}
