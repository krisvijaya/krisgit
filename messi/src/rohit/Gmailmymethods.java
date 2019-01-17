package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailmymethods
{
public WebDriver driver;
public WebDriverWait wait;
public String lunch(String e,String d,String c)
{
	if(e.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(e.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","D:\\batch239\\firefoxdriver.exe");
		driver=new FirefoxDriver();	
	}
	else
	{
		return("unknown browser");
	}
	driver.get(d);
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
	return("done");
}
public String fill(String e,String d,String c) throws Exception
{
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
	driver.findElement(By.xpath(e)).sendKeys(d);
return("done");
}
public String click(String e,String d,String c)
{
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
driver.findElement(By.xpath(e)).click();
return("done");
}
public String validatelogin(String e,String d,String c)
{
	if(c.equals("all valid")&&driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
	{
		return("passed");
	}
	else
	{
		return("test failed");
	}
}

	}
