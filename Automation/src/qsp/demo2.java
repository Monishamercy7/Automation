package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers1/chromedriver.exe" );	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Monisha/Desktop/webpage.html");
		//by using id
		driver.findElement(By.id("fp")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//by using name
		driver.findElement(By.name("forgot")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//by using Class name
		driver.findElement(By.className("pass")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//by using tag name
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//by using link text
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//by using partial linktext
		driver.findElement(By.partialLinkText("Inbox")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
	}

}
