package test_case;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown {

	private static final int i = 0;
	private static final WebElement k = null;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	     Thread.sleep(3000);
	     
	     WebElement dropdownButton=driver.findElement(By.id("dropdown-class-example"));
	     Select s=new Select(dropdownButton);
	     s.selectByIndex(1);
	     Thread.sleep(3000);
	     
	     s.selectByValue("option2");
	     Thread.sleep(3000);
	     
	     s.selectByVisibleText("Option3");
	     Thread.sleep(3000);
	     
	     List<WebElement>options=s.getOptions();
	     //for(int i=0;i<options.size();i++);
	     //{
	    //	System.out.println( options.get(i).getText());
	     //}
	     
	     for(WebElement j:options);
	     {
	    	 System.out.println(k.getText());
	     }
	     
	     


	     
		
		
		
		
		
		
		
		
	}

}
