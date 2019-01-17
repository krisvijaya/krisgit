package way2smstests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import way2smspages.Homepage;
import way2smspages.Sendsmspage;

public class Way2smstestng
{
public WebDriver driver;
Homepage hp;
Sendsmspage sp;
@BeforeMethod
public void launch()
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.way2sms.com/");
	   hp=new Homepage(driver);
	   sp=new Sendsmspage(driver);
}
@Test
@Parameters({"waymobno","waypwd","mobilenofill","waymessage"})
public void login(String x,String y,String z,String w) throws Exception
{
	hp.fillwaymobno(x);
	hp.fillwaypwd(y);
	hp.clickwaylogin();
	Thread.sleep(5000);
	sp.fillmobilenofill(z);
	sp.fillwaymessage(w);
	sp.clickwaysendsms();
	Thread.sleep(8000);
}
@AfterMethod
public void close()
{
	driver.close();
}

}
