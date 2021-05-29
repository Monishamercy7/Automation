package Monu;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class scrnShot {

	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
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
		driver.get("https://www.amazon.in/");
		getScreenShot(driver, "D1");
		driver.findElement(By.xpath("//a[@href='/gp/goldbox?ref_=nav_cs_gb_5bf06ae8328043a2beb2754f40a54c84']")).click();
		getScreenShot(driver, "D2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Festive Sarees Upto 90% Off']/parent::div/parent::div/parent::div/parent::a/parent::div/parent::div/div/div/div[6]/a")).click();
		getScreenShot(driver, "D3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort By:']")).click();
		getScreenShot(driver, "D4");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-labelledby='dropdown1_1']")).click();
		getScreenShot(driver, "D5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort By:']")).click();
		getScreenShot(driver, "D6");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-labelledby='dropdown1_2']")).click();
		getScreenShot(driver, "D7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort By:']")).click();
		getScreenShot(driver, "D8");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-labelledby='dropdown1_3']")).click();
		getScreenShot(driver, "D9");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort By:']")).click();
		getScreenShot(driver, "D10");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-labelledby='dropdown1_4']")).click();
		getScreenShot(driver, "D11");
		Thread.sleep(4000);
		driver.close();
	}
}
