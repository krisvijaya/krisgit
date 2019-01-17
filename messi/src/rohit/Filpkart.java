package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[contains(@title,'Mix - Pillaa Raa Full Video Song 4K')]")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	WebElement e=driver.findElement(By.xpath("//*[contains(@title,'Mix - Pillaa Raa Full Video Song 4K')]"));
	js.executeScript("arguments[0].scrollIntoView();",e);
	Thread.sleep(5000);
	//driver.close();

	}

}
