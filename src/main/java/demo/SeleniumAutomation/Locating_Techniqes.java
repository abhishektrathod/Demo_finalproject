package demo.SeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locating_Techniqes {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	
	    driver.manage().window().maximize();
	
	    Thread.sleep(500);
	    
	    WebElement emailText=driver.findElement(By.xpath("//label[@for='email']"));
	               //EMAIL TEXT
	    // verify whether email text is displayed or not
	   System.out.println(emailText.isDisplayed());
		 
	   // verify whether email text is correct or not or not
	   System.out.println(emailText.getText());
	               
	   
	               //EMAIL TEXT FIELD
	   WebElement emailTextField=driver.findElement(By.xpath("//input[@id='email']"));
	   
	   // verify whether emailTextField is displayed or not
	   System.out.println(emailTextField.isDisplayed());
	   
	   // verify whether emailText Field is enabled(Clickable) or not
	   System.out.println(emailTextField.isEnabled());
	  
	   //enter in to the TextField
	   emailTextField.sendKeys("abhirathod2012@gmail.com");
	   
	   //verify whether email text is displayed or not
	   System.out.println(emailTextField.getText());
	
	   Thread.sleep(6000);
	   
	   
	   //genderTextfield
	   
	   WebElement genderText=driver.findElement(By.xpath("//label[@for='gender']"));
	   System.out.println(genderText.isDisplayed());
	   
	   System.out.println(genderText.isEnabled());
	   
	   genderText.click();
	   genderText.sendKeys("male");
	   
	   
	   //Mobile no Text
	   
	   WebElement mobileText=driver.findElement(By.xpath("//label[@for='mobile']"));
       
	   System.out.println(mobileText.isDisplayed());
       System.out.println(mobileText.getText());
	   System.out.println(mobileText.isEnabled());
	   
	   
	   //Mobile no TextField
	   
	  WebElement mobileTextField=driver.findElement(By.id("mobile"));
	  
	  System.out.println(mobileTextField.isEnabled());
	   
	   
	  mobileTextField.click();
	 
	  mobileTextField.sendKeys("9021663653");
	  Thread.sleep(6000);
	   

	   
	
	
	
	
	
	}

}
