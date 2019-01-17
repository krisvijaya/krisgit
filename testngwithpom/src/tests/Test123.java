
package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;
import pages.Mailpage;

public class Test123 
{
	public WebDriver driver;
	Homepage hp;
	Loginpage lp;
	Mailpage mp;
	@BeforeMethod
	public void launch() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://mail.google.com/mail/u/0/#inbox");
		   Thread.sleep(5000);
		   hp=new Homepage(driver);
		  lp=new Loginpage(driver);
		  mp=new Mailpage(driver);
	}
	@Test
	@Parameters({"uid","pwd"})
	public void login(String x,String y) throws Exception
	{
		hp.filluid(x);
		hp.clickuidnext();
		Thread.sleep(5000);
		lp.fillpwd(y);
		lp.clickpwdnext();
		Thread.sleep(5000);
		if(mp.comp.isDisplayed())
		{
			Assert.assertTrue(true,"login test passed");
			
		}
		else
		{
			Assert.assertTrue(false,"login test failed");
		}
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}