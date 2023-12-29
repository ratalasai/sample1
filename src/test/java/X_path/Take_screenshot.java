package X_path;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_screenshot {
	
	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
	/*	TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./ScreenShots/redbus.png");
		FileUtils.copyFile(src, trg);
	*/
		
		WebElement logo = driver.findElement(By.xpath("//img[@title='redBus']"));
		
		File src = logo.getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShots/redbuslogo.png");
		FileUtils.copyFile(src, des);
		
		
		
	}
	

}
