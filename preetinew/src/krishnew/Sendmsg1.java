package krishnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sendmsg1 
{
	public WebDriver driver;
	@FindBy(name="toMobile")
	public WebElement fillmbno;
	@FindBy(name="message")
	public WebElement fillmsg;
	@FindBy(xpath="//*[@id='sendButton']")
	public WebElement sendmsg;
	
	public Sendmsg1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void fillmbno(String w)
	{
		fillmbno.sendKeys(w);
	}
	public void fillmsg(String z)
	{
		fillmsg.sendKeys(z);
	}
    public void clicksendmsg()
    {
    	sendmsg.click();
    }

}
