package Monu;

public class Snippet {
	public static void GetCategoriesFromRow(int row)
	{
	    By locator = By.cssSelector("table[__gwtcellbasedwidgetimpldispatchingfocus] tr[__gwt_row='" + row + "'] select");
	    for (int i = 0; i < new Select(driver.findElement(locator)).getOptions().size(); i++)
	    {
	        new Select(driver.findElement(locator)).selectByIndex(i);
	        System.out.println(new Select(driver.findElement(locator)).getFirstSelectedOption().getText());
	    }
	
	public static void main(String[]arg) {
		driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");
		new WebDriverWait(driver, 10)
		        .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table[__gwtcellbasedwidgetimpldispatchingfocus]")));
		GetCategoriesFromRow(0);
	}
	
}

