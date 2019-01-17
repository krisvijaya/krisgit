package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chiru 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:\\www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("chiru",Keys.ENTER);
	driver.close();
	}

}
