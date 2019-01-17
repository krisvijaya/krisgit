package rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{

	public static void main(String[] args)throws Exception
	{
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
    driver.manage().window().maximize();
	driver.findElement(By.name("identifier")).sendKeys("krisjoshi147@gmail.com");
    driver.findElement(By.xpath("//*[text()='Next']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
    driver.findElement(By.xpath("//*[text()='Next']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@aria-label='Inbox 12424 unread']")).click();
    driver.findElement(By.xpath("")).click();
  }

}
