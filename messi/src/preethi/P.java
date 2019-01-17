package preethi;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P
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
			  public void validatetitle() throws Exception
			  {
				  String t=driver.getTitle();
				  if(t.contains("Free SMS"))
				  {
					  Assert.assertTrue(true, "Tittle test is passed");
				  }
				  else
				  {
					  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					  File dest = new File("preeti1.png");
					  FileUtils.copyFile(src,dest);
					  Reporter.log("preeti.png");
					  Assert.assertTrue(false, "Tittle test was failed");
				  }
				//div[@class='mdw-ft align-right']/descendant::button[@onclick='return validLogin();']
			  }
			  @Test
			  public void login() throws Exception
			  {
			  driver.findElement(By.xpath("(//*[@class='input-field-md input__field'])[1]")).sendKeys("8668218023");
			  driver.findElement(By.name("password")).sendKeys("Preeti123");
			  driver.findElement(By.xpath("//div[@class='mdw-ft align-right']/descendant::button[@onclick='return validLogin();']")).click();
			  Thread.sleep(5000);
			  }
			  @Test
			  public void closed()
			  {
				  driver.close();
			  }

	}
