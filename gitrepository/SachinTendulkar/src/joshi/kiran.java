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

public class kiran {
		public static void main(String[] args) throws Exception 
		{
			//Give color name
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter red/green/black/blue");
			String cname=sc.nextLine();
			int count=0;
			int percentage;
			Color ec=null;
			switch(cname)
			{
			case "black":
				ec=Color.BLACK;
				break;
			case "red":
				ec=Color.RED;
				break;
			case "blue":
				ec=Color.BLUE;
				break;
			case "green":
				ec=Color.GREEN;
				ec=new Color(0,128,0);
				break;
		    default:
		    	System.out.println("Wrong color");
		    	System.exit(0);
		    
		   }
			
			//Details of ARD and PhoneApp
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(CapabilityType.BROWSER_NAME,"");
			dc.setCapability("deviceName", "3300657b3947c267");
			dc.setCapability("platformName", "android");
			dc.setCapability("platformVersion", "6.0.1");
			dc.setCapability("appPackage", "com.vodqareactnative");
			dc.setCapability("appActivity", "com.vodqareactnative.MainActivity");
			//Start Appium Server
			 Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
			 URL U=new URL("http://0.0.0.0:4723/wd/hub");
			 Thread.sleep(20000);
			 //Create driver object to Launch app
			 AndroidDriver driver;
			 while(2>1) //infinite loop
			 {
				 try
				 {
					 driver=new AndroidDriver(U,dc);
					 break; //Terminate from loop
					 
				 }
				 catch(Exception ex)
				 {
					 
				 }
			 }
		     //Automation
			 try
			 {
				 WebDriverWait wait = new WebDriverWait(driver,20);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
				 driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
				 //Swipe for WheelPicker Option
				 while(2>1)
				 {
					 try
					 {
						 driver.findElement(By.xpath("//*[@text='Wheel Picker']")).click();
						 break; //terminate from loop
					 }
					 catch(Exception ex)
					 {
						 TouchAction ta= new TouchAction(driver);
						 driver.context("NATIVE_APP");
						 int w= driver.manage().window().getSize().getWidth();
						 int h=driver.manage().window().getSize().getHeight();
						 int x1=w/2;
						 int y1=(int)(h*0.9);
						 int x2=w/2;
						 int y2=(int)(h*0.4);
						 ta.press(x1,y1);
						 
					 }
				 }
			 }
			 catch(Exception ex)
			 {
				 
			 }
		}
}
