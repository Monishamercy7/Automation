package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IllegalStateException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers1/chromedriver.exe" );
		ChromeDriver c = new ChromeDriver();
		
		Thread.sleep(4000);
		
	}
}
