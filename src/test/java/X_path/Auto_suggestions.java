package X_path;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggestions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation Testing");
		
		List<WebElement> options = driver.findElements(By.xpath("//span[text()='automation testing']"));
		System.out.println(options.size());
		
		for(WebElement auto : options) {
			System.out.println(auto.getText());
			
			if(auto.getText().contains("jobs")) {
				auto.click();
			}
		}
		
		
	}
	

}
