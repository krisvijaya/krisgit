package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keydriven1
{
public WebDriver driver;
public WebDriverWait wait;
public String launch(String e,String d,String c)
{
	 if(e.equals("chrome"))
	 {
		 System.setProperty("WebDriver.chrome.driver","D:\\batch239\\chrome.exe");
		 driver=new ChromeDriver();
	 }
	 else if(e.equals("firefox"))
	 {
		 System.setProperty("WebDriver.gecko.driver","D:\\batch239\\firefox.exe");
		 driver=new FirefoxDriver();	 
	 }
	 else
	 {
		 return("unknown browser");
	 }
	 driver.get(d);
	 wait=new WebDriverWait(driver,20);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobile.no")));
	 return("done");
}
public String fill(String e,String d,String c) throws Exception
{
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(e)));
	driver.findElement(By.xpath(e)).sendKeys(d);
	return(e);
}
public String click(String e,String d,String c)
{
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(e)));
	driver.findElement(By.xpath(e)).click();
	return("done");
}
public String validateLogin(String e,String d,String c) throws Exception
{
	if(c.equals("All_valid") && driver.findElement(By.xpath("//*[@text='send-sms']")).isDisplayed());
	{
	return("passed");
	}
	else
	{
	return("failed");
	}
	
}
}

