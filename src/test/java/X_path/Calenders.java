package X_path;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	@SuppressWarnings({ })
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.id("first_date_picker")).click();
		
		String user_year="2025";
		String user_month="December";
		String user_date="18";
		
		while (true) {
			
			String month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			String[] monthyearsplit = month_year.split(" ");
			
			String year = monthyearsplit[1];
			String month = monthyearsplit[0];
			
			if(month.equals(user_month) && year.equals(user_year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
		List<WebElement> days = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		
		for(WebElement calenderdates : days) {
			
			if(calenderdates.getText().equals(user_date)) {
				calenderdates.click();
			}
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		String User_Year = "2022";
		String User_Month = "September";
		String User_Date= "17";
		
		driver.findElement(By.id("second_date_picker")).click();
		
		while(true) {
			
		String year_month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		String[] yearmonthsplit = year_month.split(" ");
		
		String Month= yearmonthsplit[0];
		String Year = yearmonthsplit[1];
		

			if(Month.equals(User_Month) && Year.equals(User_Year)) {
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}
		
		List<WebElement> Dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
		
		for(WebElement calenderdays : Dates) {
			
			if(calenderdays.getText().equals(User_Date)) {
				
				calenderdays.click();
			}
		}
		
	}

}
