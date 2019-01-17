package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nextpage1 
{
public WebDriver driver;
@FindBy(name="toMobile")
public WebElement mobno1;
@FindBy(id="message")
public WebElement text;
@FindBy(id="sendButton")
public WebElement sendtxt;
@FindBy(xpath="//*[@class='logout']")
public WebElement logout;
public Nextpage1(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void fillmobno1(String x)
{
	mobno1.sendKeys(x);
}
public void filltext(String x)
{
	text.sendKeys(x);
}
public void clicksendtxt()
{
	sendtxt.click();
}
public void clicklogout()
{
	logout.click();
}
}
