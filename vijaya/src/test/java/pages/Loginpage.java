package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	//Locating Elements
	public WebDriver driver;
	
	@FindBy(name="password")
	public WebElement pwd;
	@FindBy(xpath="(//*[@class='ZFr60d CeoRYc'])[1]")
	public WebElement pwdnext;
	
//Methods of operation
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fillpwd(String x)
	{
		pwd.sendKeys(x);
	}
	public void clickpwdnext()
	{
		pwdnext.click();
	}

}
