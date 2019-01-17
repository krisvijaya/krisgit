package shrirame1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sendmsgpage
{
	public WebDriver driver;
	@FindBy(xpath="(//a[@href='send-sms'])[4]")
	public WebElement send_sms;
	@FindBy(xpath="//a[@class='logout']")
	public WebElement logout;
	public Sendmsgpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logout()
	{
		logout.click();
	}

}
