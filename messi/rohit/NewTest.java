package rohit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest
{
	public WebDriver driver;
  @Test(priority=0)
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");  
  }
	
	  @Test
	  public void validatetitle()
	  {
		  String t=driver.getTitle();
		  if(t.contains("Free SMS"))
		  {
			  Assert.assertTrue(true, "Tittle test is passed");
		  }
		  else
		  {
			  File src = ((TakeScreenShot)driver).getScreenShotAs(OutputType.FILE);
			  File dest = new file("preeti1.png");
			  FileUtils.copyFile(src,dest);
			  Reporter.log("preeti.png");
			  Assert.assertTrue(False, "Tittle test was failed");
		  }
	  }
	  @Test
	  public void login()
	  {
	  driver.findElement(By.xpath("(//*[@class='input-field-md input__field'])[1]").sendKeys("8668218023");
	  driver.findElement(By.name("password")).sendKeys("Preeti123");
	  driver.findElement(By.id("button")).click();
	  Thread.sleep(5000);
}
	  @Test
	  public void closed()
	  {
		  driver.close();
	  }

}