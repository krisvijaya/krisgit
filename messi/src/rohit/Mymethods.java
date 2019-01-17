package rohit;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mymethods 
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
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("e")));
 driver.findElement(By.xpath(e)).sendKeys(d);
 return(e);
}
public String click (String e,String d,String c) throws Exception
{
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
 driver.findElement(By.xpath(e)).click();
 return(e);
}
public String validatelogin(String e,String d,String c) throws Exception
{
	try
	{
		if(c.equals("all_valid")&&driver.findElement(By.xpath("//*[@id='freeGroupSMS']")).isDisplayed())
		{
			return("passed");
		}
		else if(c.equals("mobileno_blank")&&driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
		{
			return("passed");
		}
		else
		{
			String temp=this.Screenshot();
			return("testfailed&goto"+temp+".png");
		}
	}
    catch(Exception ex)
    {
	String temp=this.Screenshot();
	return("Testinterrupted&goto"+temp+".png");
    }
}
public String closesite(String e,String d,String c) throws Exception
    {
     driver.close();
     return("done");
    }
    public String Screenshot() throws Exception
    {
    Date dt=new Date();
    String ssname=dt.toString();
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest=new File(ssname+".png");
    FileUtils.copyFile(src,dest);
    return("done");
    }
}









