package Monu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class insta {

	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("rahulbgiddale17@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("nikhilwru?");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[text()='Save your login information?']/parent::div/parent::section/parent::div//button[@class='sqdOP yWX7d    y3zKF     ']")).click();
		driver.findElement(By.xpath("//div[@class='cmbtv']")).click();
	}
	
}
