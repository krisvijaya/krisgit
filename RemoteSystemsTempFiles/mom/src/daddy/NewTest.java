package daddy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NewTest
{
	public WebDriver driver;
 @Test(priority=0)
 @Parameters({"browser"})
  public void launch(String e) 
  {
	if(e.equals("chrome"))
	 {
	   System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	   driver=new ChromeDriver();
	   Thread.sleep(5000);
	  }
	 else if(e.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","D:\\batch239\\geckodriver.exe");
			driver=new FirefoxDriver(); 
	  }
	  else
	  {
	    Assert.assertTrue(false, "unknowbrowser");
	  }
	  driver.get("https://www.google.com/");
 @Test(priority=1,dependsOnMethods={"launch"})
 @Parameters({"search word"})
  public void searchword(String x)
  {
	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
  }
   @Test(priority=2)
   public void close() 
  {
	 driver.close();
  }
}
