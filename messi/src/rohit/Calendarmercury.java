package rohit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendarmercury
{
public static void main(String[] args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();	
	driver.get("https://www.mercurytravels.co.in/");
	driver.findElement(By.xpath("(//*[text()=' Flights'])[2]")).click();
    driver.findElement(By.name("fromCity")).sendKeys("hyderabad");
	driver.findElement(By.name("toCity")).sendKeys("delhi");
	driver.findElement(By.xpath("//*[@class='form-control ']")).click();
	//driver.findElement(By.xpath("(//*[text()='September 2018'])[3]")).click();//September 2019
	//Actions a=new Actions(driver);
	//List<WebElement> l=driver.findElements(By.xpath("//*[@class='next']"));
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    Thread.sleep(5000);
	   // driver.findElement(By.xpath("(//*[@class='next'])[7]")).click();
	    Thread.sleep(5000);
		for(int i=1;i<=13;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//table)[7]/thead/tr[1]/th[3]")).click();
		}
}
}
	
