package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//location of elements
		public WebDriver driver;
		
		@FindBy(name="identifier")
		public WebElement uid;
		
		@FindBy(xpath="(//*[@class='CwaK9'])[1]")
		public WebElement uidnext;
		//Methods of operation
		public Homepage(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		public void filluid(String x)
		{
		uid.sendKeys(x);	
		}
		public void clickuidnext()
		{
			uidnext.click();
		}

}
