package Monu;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class newTab {
	
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}

	
	public static void getScreenShot(WebDriver driver,String name) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Monisha\\eclipse-workspace\\Automation\\src\\Monu"+name+".png");
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		}
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[position()=1]")).click();
		Set<String> alltabs = driver.getWindowHandles();
		for(String tabs: alltabs)
		{
		driver.switchTo().window(tabs);
		}
		Thread.sleep(2000);
		for(int i = 2; i<=6; i++)
		{
			Thread.sleep(2000);
			String xp ="(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()='" + i + "']";
			driver.findElement(By.xpath(xp)).click();
			Thread.sleep(2000);
//			getScreenShot(driver, "'" + i + "'");
		}
		
		for(int j = 2; j<=5; j++) 
		{
		for(int i = 2; i<=5; i++)
		{
			Thread.sleep(2000);
			String xp ="(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()='" + i + "']";
			driver.findElement(By.xpath(xp)).click();
			Thread.sleep(2000);
//			getScreenShot(driver, "'" + i + "'");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[position()='" + j + "']")).click();
		}
		
//		getScreenShot(driver, "A1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "A2");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "A3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "A4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "A5");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=6]")).click();
//		
//		
//		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[1]")).click();
//		getScreenShot(driver, "B1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "B2");
////		driver.findElement(By.xpath("(//input[@class='a-button-input'])[10]")).click();
////		Thread.sleep(2000);
////		getScreenShot(driver, "i1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "B3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "B4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "B5");
//		
//		
//		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "C1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "C2");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "C3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "C4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "C5");
//		
//		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "D1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "D2");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "D3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "D4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "D5");
//		
//		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "E1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "E2");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "E3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "E4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "E5");
//		
//		driver.findElement(By.xpath("(//a[@class=' kfs-link'])[5]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "F1");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=2]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "F2");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=3]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "F3");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=4]")).click();
//		Thread.sleep(2000);
//		getScreenShot(driver, "F4");
//		driver.findElement(By.xpath("(//li[@class='a-spacing-small item imageThumbnail a-declarative'])[position()=5]")).click();
//		getScreenShot(driver, "F5");
		
		
		
		driver.close();
	}
}
