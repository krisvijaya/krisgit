package joshi;

import java.awt.Color;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Voicereconization1
{

	public static void main(String[] args) throws Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter red/blue/green/black");
	String cname=sc.nextLine();
	int count=0;
	int percentage;
	Color ec=null;
	switch(cname)
	{
	case"black":
	ec=Color.BLACK;
	case"red":
	ec=Color.RED;
	case"blue":
	ec=Color.BLUE;
	case"green":
	ec=Color.GREEN;
	break;
	default:
	System.out.println("wrong color");
	System.exit(0);	
	}
	//ARD details
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","8LJZBEBY99999999");
	dc.setCapability("platformName","android");
	dc.setCapability("platformVersion","7.0");
	dc.setCapability("appPackage","com.vodqareactnative");
	dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
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
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
	driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
	while(2>1)
	{
		try
		{
			driver.findElement(By.xpath("//*[@text='Wheel Picker']")).click();
			break;
		}
		catch(Exception ex)
		{
			TouchAction ta=new TouchAction(driver);
			int w=driver.manage().window().getSize().getWidth();
			int h=driver.manage().window().getSize().getHeight();
			int x1=(int)(w/2);
			int x2=(int)(w/2);
			int y1=(int)(h*0.8);
			int y2=(int)(h*0.3);
			ta.press(125,1050).moveTo(125,280).release().perform();
		}
	}
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Spinner']")));
	      driver.findElement(By.xpath("//*[@class='android.widget.Spinner']")).click();
	      while(2>1)
	      {
	    	  try
	    	  {
	    		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='blue']")));
	    	      driver.findElement(By.xpath("//*[@text='blue']")).click();
	    	  }
	    	  catch(Exception ex)
	    	  {
	    		  
	    	  }
	      }
	  }
	    catch(Exception ex)
	  {
		System.out.println(ex.getMessage());
	  }
	   driver.closeApp();
	   Runtime.getRuntime().exec("taskkill /K /IM nodes.exe");
	   Runtime.getRuntime().exec("taskkill /K /IM cmd.exe");

}
}