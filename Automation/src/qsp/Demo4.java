package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4{
	static
	{ 
		System.setProperty("webdriver.gecko.driver", "./Drivers1/geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("monu");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("m@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
		
		
	
}
