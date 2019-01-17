package joshi;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipetype
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
		    WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.support.v4.view.ViewPager']")));
			driver.findElement(By.xpath("//*[@class='android.support.v4.view.ViewPager']\"")).click();
			//break;
			driver.context("NATIVE_APP");
			int w=driver.manage().window().getSize().getWidth();
			int h=driver.manage().window().getSize().getHeight();
			TouchAction ta=new TouchAction(driver);
			int x1=(int)(w*0.8);
			int y1=(int)(h/2);
			int x2=(int)(w*0.3);
			int y2=(int)(h/2);
		}
	         catch(Exception ex)
		{
	        	/*int w=driver.manage().window().getSize().getWidth();
	 			int h=driver.manage().window().getSize().getHeight();
	 			TouchAction ta=new TouchAction(driver);
	 			int x1=(int)(w*0.8);
	 			int y1=(int)(h/2);
	 			int x2=(int)(w*0.3);
	 			int y2=(int)(h/2);*/
			    ta.press(490,444).moveTo(128,444).release().perform();	
		}
}
}
