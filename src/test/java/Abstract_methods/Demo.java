package Abstract_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   // manage
		
	    driver.get("https://www.facebook.com/");  // it shows content page 
	    driver.findElement(By.xpath("//div[2]/div/div[1]/form/div[5]/a")).click(); // findElement
	    
	   //driver.close();  // its close the current page
	   
	   //driver.quit();  // its close all pages
	    
	  //  driver.navigate().back();  // navigate
	    
	    
	  
		
		
		
	}
	
	
	
	
}
