package rohit;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Colourcase1
{

public static void main(String[] args) throws Exception
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter red/green/blue/black");
 String cname=sc.nextLine();
 int count=0;
 int percentage;
 Color ec=null;
 switch(cname)
 {
 case"red":
 ec=Color.RED;
 break;
 case"green":
 ec=new Color(0,128,0);
 break;
 case"blue":
 ec=Color.BLUE;
 break;
 case"black":
 ec=Color.BLACK;
 break;
 default:
 System.out.println("wrong colour");
 System.exit(0);
}
 DesiredCapabilities dc=new DesiredCapabilities();
 dc.setCapability(CapabilityType.BROWSER_NAME,"");
 dc.setCapability("deviceName","8LJZBEBY99999999");
 dc.setCapability("platformName","android");
 dc.setCapability("platformVersion","7.0");
 //dc.setCapability("automationName","uiautomator2");
 dc.setCapability("appPackage","com.vodqareactnative");
 dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
//start appium server
 Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
	URL u=new URL("http://0.0.0.0:4723/wd/hub");
//create driver object
AndroidDriver driver;
 while(2>1)
{
  try
 {
  driver=new AndroidDriver(u,dc);
  break;
 }
 catch(Exception ex)
  {
	}
}
//details of ARD and app
 try
  {
    WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
    driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
    TouchAction ta=new TouchAction(driver);
    while(2>1)//loops
    {
     try
     {
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Wheel Picker']")));
      driver.findElement(By.xpath("//*[@text='Wheel Picker']")).click();
      break;
     }
     catch(Exception ex)
     {
    // TouchAction ta=new TouchAction(driver);
     int w=driver.manage().window().getSize().getWidth();
     int h=driver.manage().window().getSize().getHeight();
     int x1=(int)(w/2);
     int y1=(int)(h*0.8);
     int x2=(int)(w/2);
     int y2=(int)(h*0.3);
     ta.press(x1,y1).moveTo(x2,y2).release().perform();
     }
    }
  
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='android.widget.Spinner']")));
      driver.findElement(By.xpath("//*[@class='android.widget.Spinner']")).click();
      driver.findElement(By.xpath("//*[@text='"+cname+"']")).click();
      WebElement e=driver.findElement(By.xpath("//*[@bounds='[0,191][720,229]']"));
      //location of element
      int x=e.getLocation().getX();
      int y=e.getLocation().getY();
      //get width and height
      int elewidth =e.getSize().getWidth();
      int eleheight =e.getSize().getHeight();
      //get entire page screenshot
      File screenshot=driver.getScreenshotAs(OutputType.FILE);
      BufferedImage FullImg=ImageIO.read(screenshot); 
      //crop the required element screenshot
      BufferedImage elescreenshot=FullImg.getSubimage(x,y,elewidth,eleheight);
      //image colour to validate
      for(int i=0;i<elewidth;i++)
      {
      for(int j=0;j<eleheight;j++)
      {
      Color ac=new Color (elescreenshot.getRGB(i,j));
      if(ac.getRed()==ec.getRed()&&ac.getBlue()==ec.getBlue()&&ac.getGreen()==ec.getGreen())
      {
       count=count+1;
      }
      }
      }
      System.out.println(count);
      percentage=(count*100)/(elewidth*eleheight);
      if(percentage>=85)
      {
    	  System.out.println("test  color was passed");
      }
      else
      {
    	  System.out.println("test color was failed");
      }
      driver.closeApp();
  }
    catch(Exception ex)
    {
    	System.out.println(ex.getMessage());
    }
  }
}
     
     
