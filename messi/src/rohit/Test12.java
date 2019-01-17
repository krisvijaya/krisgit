package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test12
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.get("https://www.google.com/");
    WebElement e=driver.findElement(By.name("q"));
	Actions a=new Actions(driver);
	a.click(e).build().perform();
	a.sendKeys("kalam").build().perform();;
	for(int i=0;i<=3;i++)
	{
	a.sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(5000);
	}
	a.sendKeys(Keys.ENTER).build().perform();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('disable',true);",e);
	}

}
