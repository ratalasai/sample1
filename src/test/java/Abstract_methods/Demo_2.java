package Abstract_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	//	String URL = driver.getCurrentUrl();
	//	System.out.println(URL);                   // it prints current URL
		
	//	String Title = driver.getTitle();         
	//	System.out.println(Title);                 // it prints window title
		
	//	String source = driver.getPageSource();
	//	System.out.println(source);                 // it prints page source 
		
		Set<String> windoeHandles = driver.getWindowHandles();
		System.out.println(windoeHandles);           // get windowHandles
	}

}
