package X_path;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Box {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.id("sunday")).click();  // select only one CheckBox
		

		/*List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@class='form-check-label']"));
		
		System.out.println(checkboxes.size());

		for (WebElement checks : checkboxes) {

			System.out.println(checks.getText());
			
			if(checks.getText().contains("Sunday")) {
				checks.click();
			}
		}*/
		
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
		
		System.out.println(checkboxes.size());
		
		for(WebElement checks : checkboxes) {
			checks.click();         // select all check boxes
			
	
		
		}
		
	}

}
