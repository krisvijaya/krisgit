package rohit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[1]"));
		WebElement e2 = driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[2]"));
		e.clear();
		e.click();
		Thread.sleep(5000);
		List<WebElement> l1 = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sfrom']/li"));
		System.out.println(l1.size());
		/*for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
			Thread.sleep(5000);
		}*/
		for(int i=1;i<l1.size();i++)
		{
			l1.get(i).click();
			Thread.sleep(5000);
			List<WebElement> l2 = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content hp-widget__sTo']/li"));
			/*for(int i=0;i<l2.size();i++)
			{
				System.out.println(l2.get(i).getText());
				Thread.sleep(5000);
			}*/
			/*for(int j=2;j<l2.size();j++)
			{
				//Thread.sleep(5000);
				l2.get(j).click();
				Thread.sleep(5000);
				try
				{
					if(l1.get(i).getText().contains(l2.get(j).getText()))
					{
						Thread.sleep(5000);
						if(driver.findElement(By.xpath("//*[text()='The 'Departure City' and 'Destination City' cannot be same. Please re-type.']")).isDisplayed())
						{
							System.out.println("test passed");
						}
					}
					Thread.sleep(10000);
					
					WebElement e2 = driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[2]"));
					e2.click();
				}
				catch(Exception ex)
				{
					
					System.out.println(ex.getMessage());
				}
				
				e2.click();
				Thread.sleep(5000);
				
				
				
			}
			*/
			l2.get(1).click();
			Thread.sleep(10000);
			//WebElement e2 = driver.findElement(By.xpath("(//input[@class='input_fromto checkSpecialCharacters ui-autocomplete-input'])[2]"));
			e2.click();
			l2.get(2).click();
			
		}
		
		
	}
}