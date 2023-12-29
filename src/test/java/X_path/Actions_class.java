package X_path;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Actions ac = new Actions(driver);
		
		//WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		//ac.doubleClick(doubleclick).perform();  //Using doubleclick
		
		//WebElement rightclick = driver.findElement(By.xpath("//button[text()='New Browser Window']"));
		//ac.contextClick(rightclick).perform();    //Using rightclick
		//ac.click(rightclick).perform();           //Using singleclick
		
		//WebElement item = driver.findElement(By.id("draggable"));
		//WebElement designation = driver.findElement(By.id("droppable"));
		//ac.dragAndDrop(item, designation).perform(); //Using dragAndDrop
		
		WebElement move = 
				driver.findElement(By.xpath("//a[@title='Login'][@class='_1TOQfO']"));
		
		ac.moveToElement(move).build().perform();  //Using MoveToElement
		
	
	}

}
