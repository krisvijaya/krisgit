package rohit;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mercurytravels
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/flights");
	    driver.findElement(By.xpath("(//*[@class='font14'])[5]")).click();
	    driver.findElement(By.xpath("(//*[@name='tripType'])[2]")).click();
	    driver.findElement(By.name("fromCity")).sendKeys("hyderabad");
	    driver.findElement(By.name("toCity")).sendKeys("delhi");
	    Thread.sleep(5000);
	    WebElement e1=driver.findElement(By.xpath("(//*[@name='adults'])[1]"));
	    Thread.sleep(5000);
	    Actions a=new Actions(driver);
	    a.click(e1).build().perform();
	    for(int i=1;i<=3;i++)
	    {
	    a.sendKeys(Keys.DOWN).build().perform();
	    }
	    a.sendKeys(Keys.ENTER).build().perform();
	    Thread.sleep(3000);
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	     WebElement e=driver.findElement(By.xpath("//*[@id='selectElement']"));
	    js.executeScript("arguments[0].scrollIntoView();",e);
	    Thread.sleep(2000);
	    WebElement e2=driver.findElement(By.xpath("(//*[@name='cabinClass'])[1]"));
	    a.click(e2).build().perform();
	    for(int j=1;j<=3;j++)
	    {
	    	a.sendKeys(Keys.DOWN).build().perform();
	    }
	    a.sendKeys(Keys.ENTER).build().perform();
	   driver.findElement(By.xpath("(//*[@id='searchFlightsBtn'])[2]"));
	   driver.close();
	  /* Scanner sc=new Scanner(System.in);
	   System.out.println();
	   String x=sc.nextLine();*/
	}

}
