package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Getvaluesmulti
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/flights");
		WebElement e=driver.findElement(By.xpath("(//*[@name='cabinClass'])[1]"));
		Select s=new Select(e);
	    Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s.getOptions().get(3)).build().perform();
	}

}
