package daddy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng2 
{
public ChromeDriver driver;
@DataProvider(name="search word")
public Object[][] joshi()
{
	return new Object[][]
			{
		{"messi"},{"pelle"},{"ronaldo"}
			};
}
@BeforeMethod
public void Launch() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	 driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
}
@Test(dataProvider="search word")
public void search(String x) throws InterruptedException
{
	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	Thread.sleep(5000);
}
@AfterMethod
public void close()
{
	driver.close();
}
}
