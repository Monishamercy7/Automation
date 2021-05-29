package Monu;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class moveToElement {
	static {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
	public static void getScreenShot(WebDriver driver,String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Monisha\\eclipse-workspace\\Automation"+name+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//span[.='Department']/parent::div/parent::div//span[@class='a-label a-checkbox-label'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//a[@id='dealTitle'])[7]")).click();
////		driver.findElement(By.partialLinkText("Aquafresh Swift 15 Ltr Mineral Ro+Uv+Tds Adjuster And Uf Wat")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "M1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//span[@id ='a-autoid-17-announce'])[3]")).click();
//		driver.findElement(By.partialLinkText("55-70% off Men's T-Shirts, Shirts - Levi's, Spykar, UCB & more")).click();
		driver.findElement(By.id("100_dealView_0")).click();
		Thread.sleep(2000);
		WebElement A=driver.findElement(By.xpath("(//span[@id='a-autoid-18'])[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(A).perform();
//		WebElement tn = driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[2]"));
		
//		Actions act = new Actions(driver);
//		act.moveToElement(tn).perform();
//		
		
		
		
	}
}
