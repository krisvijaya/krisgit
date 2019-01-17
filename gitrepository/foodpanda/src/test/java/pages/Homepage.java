package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver driver;
	@FindBy(name="mobileNo")
	public WebElement waymobno;
	@FindBy(name="password")
	public WebElement waypwd;
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement waylogin;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void fillwaymobno(String x)
	{
		waymobno.sendKeys(x);
	}
	public void fillwaypwd(String y)
	{
		waypwd.sendKeys(y);
	}
	public void clickwaylogin()
	{
		waylogin.click();
	}

}
