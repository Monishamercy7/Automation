package Monu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertPopUps {
	static {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Monisha/Desktop/alertPopup.html");
		try {
			driver.findElement(By.xpath("//button[text()='Try it']")).click();
			Thread.sleep(2000);
			Alert a = driver.switchTo().alert();
			System.out.println("Pop up is displayed");
			String atext = a.getText();
			a.accept();
			if (atext.equals("I am an alert box!")) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
		} catch (Exception e) {
			System.out.println("Pop up is not displayed");
		}
		Thread.sleep(1000);
		driver.close();
	}

}


