package sai_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class App_login {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//div[2]/div/div[1]/form/div[5]/a")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Animal");
		driver.findElement(By.name("lastname")).sendKeys("Movie");
		driver.findElement(By.name("reg_email__")).sendKeys("xxxxxxxx11");
		driver.findElement(By.id("password_step_input")).sendKeys("xxxx@123");
		
		WebElement dropdown = driver.findElement(By.name("birthday_day"));
		Select drop = new Select(dropdown);
		drop.selectByValue("1");
		
		WebElement month = driver.findElement(By.id("month"));
		Select mon = new Select(month);
		mon.selectByValue("12");
		
		WebElement years = driver.findElement(By.id("year"));
		Select year = new Select(years);
		year.selectByValue("2002");
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		
		driver.findElement(By.xpath("//div[2]/div/div/div[1]/form/div[1]/div[11]/button")).click();
		
		driver.close();
		
		
			
			
		
	}}
