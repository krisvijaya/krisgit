package rohit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Runner1 {

	public static void main(String[] args)
	{
	try
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//create object for page class
		Loginpage1 lp = new Loginpage1(driver);
		Nextpage1 np = new Nextpage1(driver);
		//launch site
		driver.get("http://www.way2sms.com");
		WebDriverWait w = new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(lp.mobno));
		lp.fillmobno("8668218023");
		lp.fillpwd("Preeti123");
		lp.clickpwdnext();
		w.until(ExpectedConditions.visibilityOf(np.mobno1));
		np.fillmobno1("");
		np.filltext("good night..");
		np.clicksendtxt();
		np.clicklogout();
		
	}
		catch(Exception ex)
	{
			System.out.println(ex.getMessage());
	}
	}
}
