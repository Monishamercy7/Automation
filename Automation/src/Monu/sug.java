package Monu;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sug {

	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung");
		List<WebElement> allsug = driver.findElements(By.xpath("//form[@class='_2M8cLY header-form-search']//ul/li"));
		Thread.sleep(4000);
		int count = allsug.size();
		System.out.println(count);
		
		for(WebElement sug : allsug)
		{
			String text = sug.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		allsug.get(count-1).click();
		Thread.sleep(4000);
		List<WebElement> allsug1 = driver.findElements(By.xpath("//div[@class='_3pLy-c row']"));
		for(WebElement sug1 : allsug1)
		{
			Thread.sleep(1000);
			String subtext = sug1.getText();
			System.out.println(subtext);
			System.out.println("_____________________________________________________________________________");
		}
		Thread.sleep(2000);
		driver.close();
	}
}
