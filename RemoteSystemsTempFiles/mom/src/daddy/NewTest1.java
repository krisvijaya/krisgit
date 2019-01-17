package daddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
	    WebElement e=driver.findElement(By.name("q"));
  }
}
