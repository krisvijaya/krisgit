package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Mainsignin 
{
	public WebDriver driver;
	@FindBy(xpath="(//*[contains(@placeholder,'Enter your email id')])[1]")
	public WebElement redbusmobileno;
	@FindBy(xpath="")
	public WebElement redbuspwd;
}
