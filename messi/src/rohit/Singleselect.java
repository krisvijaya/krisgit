package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Singleselect
{

	public static void main(String[] args) throws InterruptedException
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
	    Select s=new Select(e1);
	    s.selectByIndex(3);
	    //WebElement e2=driver.findElement(By.xpath("(//*[@name='cabinClass'])[1]"));
	    //Slect s2=new Select(e2);
	    //s2.selectByVisibleText();

	}

}
