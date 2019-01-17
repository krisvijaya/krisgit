package joshi;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Getphonecall
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
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 for(int i=0;i<X.length();i++)
		 {
			char c=X.charAt(i);
		    String y="";
			switch(c)
			{
			 case'0':
			 y="zero";
			 break;
			 case'1':
			 y="one";
			 break;
			 case'2':
			 y="two";
			 break;
			 case'3':
			 y="three";
			 break;
			 case'4':
			 y="four";
			  break;
			 case'5':
			 y="five";
			 break;
			 case'6':
			 y="six";
			 break;
			 case'7':
			  y="seven";
			  break;
			 case'8':
			  y="eight";
			  break;
			 case'9':
			 y="nine";
			 break;
		   } 
		     driver.findElement(By.xpath("//*[contains(@resource-id,'"+y+"')]")).click(); 
		 }
		   driver.findElement(By.xpath("//*[@text='SIM1']")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[contains(@resource-id,'end_button')]")).click();
		   //call lifted
		   
		   driver.closeApp();
	   }
	     catch(Exception ex)
	      {
	    	 System.out.println(ex.getMessage());
	      }
	 Runtime.getRuntime().exec("taskkill /K /IM nodes.exe");
	 Runtime.getRuntime().exec("taskkill /K /IM cmd.exe");
}
}

	 


