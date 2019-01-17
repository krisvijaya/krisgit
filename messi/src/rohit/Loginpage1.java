package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1
{
	public WebDriver driver;
	@FindBy(name="mobileNo")
	public WebElement mobno;
	@FindBy(name="password")
	public WebElement pwd;
	@FindBy(xpath="(//button[@type='button'])[2]")
	public WebElement pwdnext;
	public Loginpage1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void fillmobno(String x)
	{
		mobno.sendKeys(x);
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
