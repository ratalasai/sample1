package Tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus_calender {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//input[@value='20/12/2023']")).click();
		
	
			String user_year="2024";
			String user_month="January";
			String user_day="31";
			
		while(true) {
				
		String monthyear = driver.findElement(By.xpath("//div[@class=' col'][@style='text-align: center;']")).getText();
		
		String[] monthyearsplit=monthyear.split(" ");
		
		String month = monthyearsplit[0];
		String year = monthyearsplit[1];
		
		if(month.equals(user_month) && year.equals(user_year)) {
			break;
		}
		else {
			driver.findElement(By.xpath("//span[@class='calender-month-change']")).click();
		}
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//span[@style='grid-column: auto;']"));
		
		for(WebElement day :days) {
			
			if(day.getText().equals(user_day)) {
				day.click();
			}
		}
		
		
	}

}
