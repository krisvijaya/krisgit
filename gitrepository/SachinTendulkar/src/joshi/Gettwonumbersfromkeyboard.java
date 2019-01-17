package joshi;

import java.net.URL;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Gettwonumbersfromkeyboard 
{

	public static void main(String[] args) throws Exception
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st number");
	String X=sc.nextLine();
	System.out.println("enter 2nd number");
	String Y=sc.nextLine();
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","emulator-5554");
	dc.setCapability("platformName","andriod");
	dc.setCapability("platformVersion","4.2.2");
	dc.setCapability("appPackage","com.android.calculator2");
	dc.setCapability("appActivity","com.android.calculator2.Calculator");
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
	          Thread.sleep(10000);
	          driver.findElement(By.xpath("//*[@text='"+c+"'][@index='2']")).click();
            }
	          driver.findElement(By.xpath("//*[@text='+']")).click();
	          for(int i=0;i<Y.length();i++)
	        {
             char c=Y.charAt(i);
	         driver.findElement(By.xpath("//*[@text='"+c+"']")).click();
	        }
	         driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
             String W=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
             System.out.println(W);
             driver.closeApp();
         }
          catch(Exception ex)
           {
             System.out.println(ex.getMessage());
           }
            Runtime.getRuntime().exec("taskkill /F /IM node.exe");
            Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
 }
 }	



