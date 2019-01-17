package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keyfirst
{
	public WebDriver driver;
	public WebDriverWait Wait;
	public void launch(String e,String d,String c)
	{
		if(e.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(e.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\batch239\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}

}
