import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest 
{
Public WebDriver driver;
  @Test
  public void Launch(String e)
  {
	if(e.equals("chrome"))
	{
	 System.setProperty("WebDriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	 driver=new chromeDriver();
	}
	else if(e.equals("firefox"))
	{
	 System.setProperty("WebDriver.gecko.driver","D:\\batch239\\gecko.exe");
	 driver=new firefoxDriver();	
	}
	else
	{
	  Assert.assertTrue("unknow browser",flase);
	}
  }
  @Test
  public void ()
  {
	  
  }
  @Test
  public void f()
  {
	  
  }
}
