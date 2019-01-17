package shrirame1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	public WebDriver driver;
	@FindBy(name="mobileNo")
	public WebElement mbno1;
	@FindBy(name="password")
	public WebElement pwd1;
	@FindBy(xpath="(//button[@class='btn-theme-sm btn-ls text-uppercase'])[1]")
	public WebElement login1;
	@FindBy(xpath="//*[text()='Enter your mobile number']")
	public WebElement blank_mbno;
	@FindBy(xpath="//*[text()='Enter password']")
	public WebElement blank_pwd;
	@FindBy(xpath="//*[text()='Your mobile number is not register with us.']")
	public WebElement invalid_mbno;
	@FindBy(xpath="//*[text()='Incorrect number or password! Try Again.']")
	public WebElement invalid_pwd;
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fillmbno1(String x)
	{
		mbno1.sendKeys(x);
	}
	public void fillpwd1(String y)
	{
		pwd1.sendKeys(y);
	}
	public void clicklogin1()
	{
		login1.click();
	}
	
}
