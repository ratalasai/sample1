package X_path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		String window = driver.getWindowHandle();
		System.out.println("window id :"+ window);
		
		driver.findElement(By.xpath("//div[@class='rb_main_secondary_item  link']")).click();
		String window2 = driver.getWindowHandle();
		System.out.println("window2 id :"+ window2);
		
		driver.findElement(By.xpath("//div[2]/div/div/div[2]/i")).click();
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		
		String window3 = driver.getWindowHandle();
		System.out.println("window3 id :"+ window3);
		
		driver.getWindowHandles();
	}

}
