package Tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Empirw_home_14_12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.name("emailid")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.id("pword")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		
		Actions ac = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//i[@class='fa fa-houzz']"));
		ac.moveToElement(move).build().perform();
		
		driver.findElement(By.xpath("//a[text()='All Inventory']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buttonexport'][@id='buttonlist']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("select2-catDD-container")).click();
		driver.findElement(By.xpath("//input[@type='search'][@class='select2-search__field']")).sendKeys("Hall");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/form/div[1]/div[2]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("//input[@type='search'][@role='textbox']")).sendKeys("Bed Room");
		driver.findElement(By.name("ModelNumber")).sendKeys("756xxx3711");
		driver.findElement(By.name("Title")).sendKeys("Tablemate");
		driver.findElement(By.name("ItemDescription")).sendKeys("It is use's for children education");
		
		driver.findElement(By.name("Brand")).sendKeys("Empire Home");
		driver.findElement(By.name("Height")).sendKeys("2x2(Feet)");
		driver.findElement(By.name("Width")).sendKeys("2x2(Feet)");
		driver.findElement(By.name("Breadth")).sendKeys("5mm");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		driver.findElement(By.name("ColorName")).sendKeys("Off white & Biscuit");
		driver.findElement(By.xpath("//span[text()='AaAaAaAa']")).click();
		driver.findElement(By.xpath("//li[text()='basha']")).click();
		driver.findElement(By.id("select2-InventoryConditonId-container")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Very Good']")).click();
		
		driver.findElement(By.id("select2-InventoryLocationId-container")).click();
		driver.findElement(By.xpath("//li[text()='Guntur']")).click();
		driver.findElement(By.name("ActualPrice")).sendKeys("2999/-");
		driver.findElement(By.id("select2-factor-container")).click();
		driver.findElement(By.xpath("//li[text()='2.00']")).click();
		
		driver.findElement(By.name("HSNCode")).sendKeys("00xxx1234");
		driver.findElement(By.name("RackName")).sendKeys("786");
		driver.findElement(By.name("PODetails")).sendKeys("SS Rao, Speed way...");
		
		driver.findElement(By.name("InvoiceNumber")).sendKeys("1234xxx890");
		driver.findElement(By.name("Qty")).clear();
		driver.findElement(By.name("Qty")).sendKeys("100");
		
		WebElement file = driver.findElement(By.name("ColorImageUploaded"));
		js.executeScript("arguments[0].click()",file);
		
		Robot rb = new Robot();
		rb.delay(3000);
		
		StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\Picture1");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		WebElement pfile = driver.findElement(By.name("ProductMainImageUploaded"));
		js.executeScript("arguments[0].click()",pfile);
		
		StringSelection pf = new StringSelection("C:\\Users\\admin\\Downloads\\Table mate");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pf,null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
