package rohit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test10 
{

	public static void main(String[] args) throws InterruptedException
	{
		//open browser
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//create object
		Homepage hp=new Homepage(driver);
		//launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(hp.uid));
		//do login
		hp.filluid("krisjoshi147@gmail.com");
        hp.clickuidnext();
	}

}
