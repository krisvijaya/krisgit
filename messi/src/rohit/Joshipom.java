package rohit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Joshipom 
{
	
	
public static void main(String[] args) 
{
try
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Way2first wf=new Way2first(driver);
	Way2secondpage ws=new Way2secondpage(driver);
	driver.get("http://www.way2sms.com/");
	WebDriverWait w=new WebDriverWait(driver,100);
	w.until(ExpectedConditions.visibilityOf(wf.waymobno));
	wf.fillwaymobno("8341111338");
	wf.fillwaypwd("E2832M");
	wf.clickwaylogin();
	w.until(ExpectedConditions.visibilityOf(ws.mobilenofill));
	ws.fillmobilenofill("8688970007");
	ws.fillwaymessage("hai");
	ws.clickwaysendsms();
	}
catch(Exception ex)
{
	System.out.println(ex.getMessage());
}

	}

}
