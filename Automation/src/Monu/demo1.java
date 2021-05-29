package Monu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
	}
	
public static void main(String[] args)
{
	WebDriver driver=new FirefoxDriver();
}
}
