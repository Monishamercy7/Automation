package Monu;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class window {
	static {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monisha\\eclipse-workspace\\Automation\\Drivers1\\chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Monisha/Desktop/webpage2.html");
		WebElement tab = driver.findElement(By.tagName("body"));
		List<WebElement> tables = tab.findElements(By.tagName("table"));
		int count=tables.size();
		System.out.println("No. of tables: "+count);
		//to count the rows
		//table[@id='t1']/tbody/tr
		WebElement row2 = driver.findElement(By.id("t1"));
		WebElement row3 = row2.findElement(By.tagName("tbody"));
		List<WebElement> row4 = row3.findElements(By.tagName("tr"));
		int count1=row4.size();
		System.out.println("No. of rows in a table: "+count1);
		//to count the columns
		//(//table/tbody/tr)[1]/td
		WebElement col = driver.findElement(By.id("t1"));
		List<WebElement> col2 = col.findElements(By.tagName("tr"));
		List<WebElement> col3 = col2.get(1).findElements(By.tagName("td"));
		int count2=col3.size();
		System.out.println("No. of columns: "+count2);
		//to count number of cells
		////table[1]//tr/td
		 WebElement cells = driver.findElement(By.id("t1"));
		 List<WebElement> cell1 = cells.findElements(By.tagName("td"));
		 int count3=cell1.size();
		 System.out.println("No. of cells: "+count3);
		 //to print content of all the tables
		List<WebElement> content = driver.findElements(By.tagName("table"));
		 List<WebElement> contents = content.get(0).findElements(By.tagName("td"));
		 for(WebElement content1: contents)
		 {
			 String text=content1.getText();
			 System.out.println(text);
		 }
		 List<WebElement> content1 = driver.findElements(By.tagName("table"));
		 List<WebElement> contents1 = content1.get(1).findElements(By.tagName("td"));
		 for(WebElement content2: contents1)
		 {
			 String text=content2.getText();
			 System.out.println(text);
		 }
		Thread.sleep(3000);
		driver.close();
}
}
