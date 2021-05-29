package Monu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook 
{
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("8123214215");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Password@17");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("(//div[@class='s45kfl79 emlxlaya bkmhp75w spb7xbtv oaz4zybt pmk7jnqg j9ispegn kr520xx4']/parent::div/parent::a/parent::div/parent::div/parent::div//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'on your mind')]/parent::div/parent::div/parent::div/parent::div/parent::div//span[text()='Photo/Video']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
