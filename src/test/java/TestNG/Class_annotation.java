package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_annotation {

	WebDriver driver;
	
	@BeforeClass
	
	public void OpenApplication() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}

	@Test
	
	public void Login() {

		driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	
	}
	
	@Test
	
	public void Logout() {
		
		driver.findElement(By.xpath("//a[@role='button'][@class='nav-link']")).click();
		driver.findElement(By.xpath("//a[text()=' Signout']")).click();
		
	}
}

