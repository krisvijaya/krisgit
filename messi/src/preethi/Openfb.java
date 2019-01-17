package preethi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openfb 
{

	public static void main(String[] args) 
	{
		WebDriver driver; 
		WebDriverWait wait;
	System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.way2sms.com");
	wait= new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Login to Way2SMS']")));
	//driver.switchTo().frame("footer");
	driver.findElement(By.linkText("Facebook")).click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[@role='button'])[2]")));
	String parentWindowHandle= driver.getWindowHandle();
	//WebElement clickElement = driver.findElement(By.xpath("//*[@role='button']")).click();
	driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("preetishrirame02@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("");
	
	

	}

}
