package joshi;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Class11 
{

	public static void main(String[] args) throws Exception
{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","8LJZBEBY99999999");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.android.contacts");
		dc.setCapability("appActivity","com.android.contacts.DialtactsContactsEntryActivity");
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
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Contacts']")));
	   driver.findElement(By.xpath("//*[@text='Contacts']")).click();
	   driver.context("NATIVE_APP");
	   int w=driver.manage().window().getSize().getWidth();
	   int h=driver.manage().window().getSize().getHeight();
	   TouchAction ta=new TouchAction(driver);
	   int x1=(int)(w/2);
	   int y1=(int)(h*0.8);
	   int x2=(int)(w/2);
	   int y2=(int)(h*0.3);
	 while(2>1)
	 {
	   
	  try
		   {
			driver.findElement(By.xpath("//*[@text='Amma New']")).click();
			break;
		   }
		   catch(Exception ex)
		   {
			   ta.press(71,1055).waitAction(Duration.ofMillis(2000)).moveTo(71,320).release().perform();
		   }
	 }
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@resource-id,'action_icon')]")));
	         driver.findElement(By.xpath("//*[contains(@resource-id,'action_icon')]")).click();
             driver.findElement(By.xpath("//*[@text='918341111338']")).click();
	        driver.findElementByAndroidUIAutomator("new UISelector().resource-id(\"end_button\")").click();

	   }
	       catch(Exception ex)
	      {
		   System.out.println(ex.getMessage());
	      }
	       Runtime.getRuntime().exec("taskkill /K /IM node.exe");
           Runtime.getRuntime().exec("taskkill /K /IM cmd.exe");
	
}

}
