package Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_calendar {
	
	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			
	    	WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
					
			driver.get("https://www.redbus.in/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			
			driver.findElement(By.id("onwardCal")).click();
			
			
	     
		
		
	}

}
