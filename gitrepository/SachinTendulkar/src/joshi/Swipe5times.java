package joshi;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe5times
{

	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","8LJZBEBY99999999");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.cricbuzz.android");
		dc.setCapability("appActivity","com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL U=new URL("http://0.0.0.0:4723/wd/hub");
       	//create object
		AndroidDriver driver;
		while(2>1)
		{
			try
			{
				driver=new AndroidDriver(U,dc);
				break;
			}
			catch(Exception ex)
			{
				
			}
		}
		//automation
		try
		 {
		  int w=driver.manage().window().getSize().getWidth();
		  int h=driver.manage().window().getSize().getHeight();
		  TouchAction ta=new TouchAction(driver);
		  /*int x1=(int)(w*0.8);
		  int y1=(int)(h/2);
		  int x2=(int)(w*0.3);
		  int y2=(int)(h/2);*/
		/* try
		   {
			driver.findElement(By.xpath("//*[contains(@resource-id,'main_content')]")).click();
			//ta.press(520,820).moveTo(20,820).release().perform();
		   }
		   catch(Exception ex)
		   {
			ta.press(520,820).moveTo(20,820).release().perform();
		   }*/
		//driver.findElement(By.xpath("//*[contains(@resource-id,'main_content')]")).click();
		  int j=(int)(w*0.7);
		  int k=(int)(h*0.7);
		  ta.press(100,700).release().perform();
		  WebDriverWait wait=new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.support.v4.view.ViewPager']")));
		  driver.findElement(By.xpath("//*[@class='android.support.v4.view.ViewPager']")).click();
		  
		 /* for(int i=1;i<5;i++)
		  {
			ta.press(530,415).moveTo(20,415).release().perform();
		  }*/
		  /*while(2>1)
		  {
			  try
			  {
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='POINTS TABLE']")));
		       driver.findElement(By.xpath("//*[@text='POINTS TABLE']")).click();
		       driver.findElement(By.xpath("//*[@text='SQUADS']")).click();
		       break;
			  }
			  catch(Exception ex)
			  {
			  }
		  }*/
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Madurai Panthers Squad']")));
	      driver.findElement(By.xpath("//*[@text='Madurai Panthers Squad']")).click();
		}
			
		  catch(Exception ex)
		   {
			System.out.println(ex.getMessage());
	    	}
					
}
}


