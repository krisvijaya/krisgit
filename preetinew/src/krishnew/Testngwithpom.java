package krishnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testngwithpom 
{
	public WebDriver driver;
	Homepage1 hp;
	Sendmsg1 sm;
	@BeforeTest
	@DataProvider(name="way2sms")
	public Object[][] Preeti()
	{
		return new Object[][]
				{
			{"8668218023","Preeti123","8341111338","lv u soo much krish"}
				};
	}
	@Test(priority=0)
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");
		hp = new Homepage1(driver);
		sm= new Sendmsg1(driver);
		
	}
	
	@Test(priority=1,dataProvider="way2sms")
	//@Parameters({"mbno","pwd","fillmbno","fillmsg"})
	public void Login(String x,String y,String w,String z) throws Exception 
	{
		hp.fillmbno(x);
		hp.fillpwd(y);
		hp.clicklogin();
		Thread.sleep(3000);
		sm.fillmbno(w);
		sm.fillmsg(z);
		sm.clicksendmsg();
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}