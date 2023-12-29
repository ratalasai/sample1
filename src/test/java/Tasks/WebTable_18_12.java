package Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_18_12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;		
				
		List<WebElement> countries =driver.findElements(By.xpath("//table[@id='countries']//tr//td[@style='width: 134.667px;']"));
		List<WebElement> checks = driver.findElements(By.xpath("//input[@class='hasVisited']"));
		
		for(int i=1; i<countries.size(); i++) {
			
			if(countries.get(i).getText().equalsIgnoreCase("India")) {
				
				js.executeScript("arguments[0].scrollIntoView(true)",countries.get(i));
				checks.get(i).click();
				
			}
		}
	}
	}
	

