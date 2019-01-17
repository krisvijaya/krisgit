package rohit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gjjdvjufd
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.get("https://www.mercurytravels.co.in/");
		List<WebElement> l=driver.findElements(By.xpath("(//*[@class='controls'])[3]"));
			for(int i=0;i<l.size();i++)
			{
				l.get(i).getText();
			}

	}

}
