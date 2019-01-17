package joshi;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Class1
{

	public static void main(String[] args) throws Exception
	
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(CapabilityType.BROWSER_NAME,"");
	dc.setCapability("deviceName","emulator-5554");
	dc.setCapability("platformName","andriod");
	dc.setCapability("platformVersion","4.2.2");
	dc.setCapability("appPackage","com.android.calculator2");
	dc.setCapability("appActivity","com.android.calculator2.Calculator");
	Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	URL U=new URL("http://0.0.0.0:4723/wd/hub");
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
	try
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='9']")).click();
		driver.findElement(By.xpath("//*[@content-desc='multiply']")).click();
		driver.findElement(By.xpath("//*[@text='5']")).click();
		driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
		String X=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
		System.out.println(X);
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



