package joshi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newlinks 
{

	public static void main(String[] args) 
	{
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://google.com");
		 List<WebElement> l= driver.findElements(By.tagName("a"));
		 System.out.println(l.size());
		 for(int i=1;i<=l.size();i++)
		 {
			 System.out.println(l.get(i).getText());
		 }
		 driver.close();
	}
	 
}


