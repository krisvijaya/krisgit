package rohit;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Cricbuzz 
{
	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","8LJZBEBY99999999");
		dc.setCapability("platformName","andriod");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("automationName","uiautomator2");
		dc.setCapability("appPackage","com.cricbuzz.android");
		dc.setCapability("appActivity","com.cricbuzz.android.lithium.app.view.activity.NyitoActivity");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL U=new URL("http://0.0.0.0:4723/wd/hub");
	//create object driver
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
		TouchAction ta=new TouchAction(driver);
		ta.tap(60,720).perform();
		Thread.sleep(5000);
		while(2>1)
		 {
		  try
		   {
			 // Thread.sleep(5000);
		    //TouchAction ta=new TouchAction(driver);
			//ta.tap(60,720).perform();
			 WebDriverWait wait=new WebDriverWait(driver,20);
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Bangladesh A']")));
		     driver.findElement(By.xpath("//*[@text='Bangladesh A']")).click();
		     break;
		   }
		    catch(Exception ex)
		    {	
			 int w=driver.manage().window().getSize().getWidth();
			 int h=driver.manage().window().getSize().getHeight();
			 int x1=(int)(w*0.8);
			 int y1=(int)(h/2);
			 int x2=(int)(w*0.3);
			 int y2=(int)(h/2);
		     ta.press(530,350).moveTo(40,350).release().perform();
		   }
		  }
		   driver.closeApp();
	}
		 
		 }
	



