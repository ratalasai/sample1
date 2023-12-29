package X_path;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement country =driver.findElement(By.id("country"));
		
		Select sel = new Select(country);
		
		//sel.selectByIndex(2);               // Using selectByIndex
		//sel.selectByValue("france");        // Using selectByValue
		sel.selectByVisibleText("India");     // Using selectByVisibleText
		
	
	
	}
	
	
}
