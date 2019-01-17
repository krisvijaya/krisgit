package rohit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gettextinsingle
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/flights");
		 WebElement e=driver.findElement(By.xpath("(//*[@name='cabinClass'])[1]"));
		 Select s=new Select(e);
		 List<WebElement> l=s.getOptions();
		 System.out.println("no.of items in drop down;"+l.size());
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i).getText()); 
		 }
	}

}
