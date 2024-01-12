package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class DataValidation_EH {

	@Test(dataProvider="userdetails" , dataProviderClass = RetriewData_EH.class  )
	
	public void datavalidation(String username, String password) {
		
		System.setProperty("webdribver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.name("emailid")).sendKeys(username);
		driver.findElement(By.name("pword")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String url = driver.getCurrentUrl();
		assertEquals(url,"http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		
		
	}
	
	
	
	
	
}
