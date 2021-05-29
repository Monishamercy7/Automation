package Monu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.AcceptAlert;

public class adventureKidsPlayCare {
//	static {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
//	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://staging.adventurekidsplaycare.com/");
		driver.findElement(By.id("user_login")).sendKeys("vigneshp");
		driver.findElement(By.id("user_password")).sendKeys("akp179");
		driver.findElement(By.name("button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		driver.findElement(By.xpath("(//b[@role='presentation'])[3]")).click();	
		driver.findElement(By.xpath("//input[@id='s2id_autogen3_search']"));
		driver.findElement(By.xpath("(//ul[@role='listbox'])[4]/li[4]/div")).click();
//		Actions act = new Actions(driver);
//		Thread.sleep(2000);
//		act.moveToElement()
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String btn = js.executeScript("document.getElementById('select2-chosen-3').click");
		
	}
	
}
