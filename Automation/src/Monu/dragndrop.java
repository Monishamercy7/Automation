package Monu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

	static {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://jqueryui.com/droppable/");
			Thread.sleep(2000);
//			driver.switchTo().frame(0);
			// WebElement R=driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
			// driver.switchTo().frame(R);
			//driver.switchTo().frame(R);
			//driver.switchTo().frame("draggable");
			WebElement r=driver.findElement(By.xpath("//div[@id='droppable']"));
			driver.switchTo().frame(r);
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			Thread.sleep(2000);
			WebElement dg = driver.findElement(By.id("draggable"));
			Thread.sleep(2000);
			WebElement dp = driver.findElement(By.xpath("//div[@id='droppable']"));
			Thread.sleep(2000);
			act.dragAndDrop(dg, dp).perform();
			
			
			
			
		}
	
}
