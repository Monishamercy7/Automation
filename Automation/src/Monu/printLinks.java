package Monu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printLinks {
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i=0; i<count; i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			System.out.println(text);
		}
		
		Thread.sleep(1000);
		driver.close();
	}
}
