package krishnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 
{
	public WebDriver driver;
	@FindBy(name="mobileNo")
	public WebElement mbno;
	@FindBy(name="password")
	public WebElement pwd;
	@FindBy(xpath="(//button[@class='btn-theme-sm btn-ls text-uppercase'])[1]")
	public WebElement login;
	public Homepage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void fillmbno(String x)
	{
		mbno.sendKeys(x);
	}
	public void fillpwd(String y)
	{
		pwd.sendKeys(y);
	}
	public void clicklogin()
	{
		login.click();
	}

}
