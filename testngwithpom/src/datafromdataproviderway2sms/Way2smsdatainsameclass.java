package datafromdataproviderway2sms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import way2smspages.Homepage;
import way2smspages.Sendsmspage;

public class Way2smsdatainsameclass
{
	//Homepage hp;
	//Sendsmspage sp;
public WebDriver driver;
@DataProvider(name="way2sms")
public Object[][] srikanth()
{
	return new Object[][]
{
{"8341111338","E2832M","8179945045","hai"}
};
}
Homepage hp;
Sendsmspage sp;
@BeforeMethod
public void launch() throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.way2sms.com/");
	   Thread.sleep(5000);
	   hp=new Homepage(driver);
	   sp=new Sendsmspage(driver);
}
@Test(dataProvider="way2sms")
public void login(String x,String y,String z,String w) throws Exception
{
	hp.fillwaymobno(x);
	hp.fillwaypwd(y);
	hp.clickwaylogin();
	Thread.sleep(5000);
	sp.fillmobilenofill(z);
	sp.fillwaymessage(w);
	sp.clickwaysendsms();
}
@AfterMethod
public void close()
{
driver.close();	
}
}