package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method_annotation {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://e-quarz.com/customer/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("si-email")).sendKeys("jakkamsairam3@gmail.com");
		driver.findElement(By.id("si-password")).sendKeys("Namo@12345");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
	}
	
	@Test
	
	public void Login_Functionality() {
		
		String url=driver.getCurrentUrl();
		
		Assert.assertEquals(url, "https://e-quarz.c");
		
	}
	
	@Test
	
	public void logout() {
		
		WebElement logout=driver.findElement(By.xpath("//a[@class='navbar-tool ml-3']"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(logout).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		String logouturl=driver.getCurrentUrl();
		
		Assert.assertEquals(logouturl, "https://quarz.com/");
		
	}
	
	
	@AfterMethod
	
	public void teardown() {
		
		
		driver.close();
	}
	
	
	
	
}
