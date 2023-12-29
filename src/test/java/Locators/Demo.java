package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://trytestingthis.netlify.app");
		
		driver.findElement(By.id("fname")).sendKeys("sai");         // using id
		driver.findElement(By.name("lname")).sendKeys("ratala");    // using name
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Contact")).click();         // using linkText
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Home")).click();     // using partialLinkText
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("sairatala");  //using x-path
		driver.findElement(By.cssSelector("#lname")).sendKeys("apashyan kirikiri"); //using CSS selector
		
		
		
	}
	
	
	
	
}
