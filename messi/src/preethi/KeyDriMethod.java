package preethi;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyDriMethod 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public String launch(String e,String d,String c) throws Exception
	{
		if(e.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(e.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\batch239\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(e.equals("opera"))
		{
			OperaOptions o= new OperaOptions();
			o.setBinary("D:\\batch239\\operadriver.exe");
			System.setProperty("webdriver.opera.driver", "D:\\batch239\\operadriver.exe");
			driver = new OperaDriver(o);
			
		}
		else
		{
			return("unknown driver");
		}
		driver.get(d);
		wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("enter mobile number")));
		driver.manage().window().maximize();
		return ("Done");
		
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
     public String validateLogin(String e,String d,String c) throws Exception
     {
	  try
	  {
		  if(c.equals("all_valid") && driver.findElement(By.xpath("//*[text()='send sms']")).isDisplayed())
		  {
			  return("test passed");
		  }
		  else if(c.equals("blank mobile no") && driver.findElement(By.xpath("//*[text(),'Enter your mobile number']")).isDisplayed())
		  {
			  return("test passed");
		  }
		  else if(c.equals("invalid mobileno") && driver.findElement(By.xpath("//*[text(),'Enter valid mobile number']")).isDisplayed())
		  {
			  return("test passed");
		  }
		  else if(c.equals("password blank") && driver.findElement(By.xpath("//*[text(),'Enter password']")).isDisplayed())
		  {
			  return("test passed");
		  }
		  else if(c.equals("password invalid") && driver.findElement(By.xpath("//*[text(),'Incorrect number or password! Try Again.']")).isDisplayed())
		  {
			  return("test passed");
		  }
		  else
		  {
			  String temp = this.screenshot();
			  return("test interupted & goto"+temp+".png");
		  } 
		  }
		  catch(Exception ex)
		  {
			  String temp=this.screenshot();
			  return("test interupted & goto"+temp+".png");
		  }
     }
	 
	  public String closeSite(String e,String d,String c) throws Exception
	    {
	     driver.close();
	     return("done");
	    }
	    public String screenshot() throws Exception
	    {
	    Date dt=new Date();
	    String ssname=dt.toString();
	    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File(ssname+".png");
	    FileUtils.copyFile(src,dest);
	    return("done");
	    }
      }
  

