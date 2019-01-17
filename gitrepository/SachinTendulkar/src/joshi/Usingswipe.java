package joshi;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Usingswipe
{

	public static void main(String[] args) throws Exception
	
{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter phone number");
		String X=sc.nextLine();*/
		//details of ARD and APP
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","8LJZBEBY99999999");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion","7.0");
		dc.setCapability("appPackage","com.android.bbkcalculator");
		dc.setCapability("appActivity","com.android.bbkcalculator.Calculator");
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
            driver.pressKeyCode(AndroidKeyCode.HOME);
           
			while(2>1)
			{
			  
				try
				{
					WebDriverWait w=new WebDriverWait(driver,20);
					w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Home screen 3']")));
					driver.findElement(By.xpath("//*[@content-desc='Home screen 3']")).click();
					//driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.bbk.launcher2:id/item_icon\")").click();
					//driver.findElementByAccessibilityId("item_icon").click();
					break;
				}
				catch(Exception ex)
				{
			      TouchAction ta=new TouchAction(driver);
			       int w=driver.manage().window().getSize().getWidth();
			      int h=driver.manage().window().getSize().getHeight();
			      int x1=(int)(w*0.8);
			      int y1=(int)(h/2);
			      int x2=(int)(w*0.3);
			      int y2=(int)(h/2);
	              Duration d=Duration.of(5,ChronoUnit.SECONDS);
			      ta.press(550,640).moveTo(60,640).waitAction(d).release().perform();
				}
			
             }
			    Runtime.getRuntime().exec("taskkill /K /IM node.exe");
			    Runtime.getRuntime().exec("taskkill /K /IM cmd.exe");
}
}


