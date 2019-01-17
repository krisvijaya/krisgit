package way2smspages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sendsmspage
{
	public WebDriver driver;
	@FindBy(name="toMobile")
	public WebElement mobilenofill;
	@FindBy(name="message")
	public WebElement waymessage; 
	@FindBy(xpath="//*[text()='Send Sms']")
	public WebElement waysendsms;


	public Sendsmspage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void fillmobilenofill(String x)
	{
		mobilenofill.sendKeys(x);
	}
	public void fillwaymessage(String y)
	{
	 waymessage.sendKeys(y);	
	}
	public void clickwaysendsms()
	{
		waysendsms.click();
	}
}
