package X_path;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String window = driver.getWindowHandle();
		System.out.println("window id :"+ window);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		String window2 = driver.getWindowHandle();
		System.out.println("window2 id :"+window2);
		
		Set<String> windows=driver.getWindowHandles();
		System.out.println("tatal windows id :"+windows);
		
		driver.switchTo().window(window);
		
	}
	

}
