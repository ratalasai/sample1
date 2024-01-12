package TestNG;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Priority is used to which test is run first
//InvacationCount is used to how many times runs the test
//Enabled is used to test run or not 
//DependsOn Method is used to skip the test with depends on test
//Groups is used to Bunch of tests are run or bunch of tests are skip with creating group name 
//TimeOut is used to set the maximum time for a test method to run
//DataProvider is used to specifies the name o the dataProvider or a test method


public class Atributes {
	
	@Test(priority=4 , invocationCount=3, groups = "sanity")
	public void x(){
		System.out.println("a");
	}
	
	@Test(priority=3 , groups ="sanity")
	public void b() {
		System.out.println("b");
	}
	
	@Test(priority=2 , dependsOnMethods="Login" , groups = "smoke")
	public void c() {
		System.out.println("c");
	}
	
	@Test(priority=1 , enabled = true , groups = "smoke")  
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		String url=driver.getCurrentUrl();
		assertEquals(url,"http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		
	}
	
	

}
