package joshi;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Getcallphone2 
{

public static void main(String[] args) throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter phone number");
	String X=sc.nextLine();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","8LJZBEBY99999999");
	dc.setCapability("platformName","andriod");
	dc.setCapability("platformVersion","7.0");
	dc.setCapability("appPackage","com.android.dialer");
	dc.setCapability("appActivity","com.android.dialer.TwelveKeyDialer");
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
	try
	{ 
		driver.pressKeyCode(AndroidKeyCode.HOME);
		
	}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	}
	Runtime.getRuntime().exec("taskkill /K /IM nodes.exe");
	 Runtime.getRuntime().exec("taskkill /K /IM cmd.exe");

	}

}
