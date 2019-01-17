package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbussignin2 
{
public WebDriver driver;
@FindBy(xpath="//*[text()='Sign In/Sign Up']")
public WebElement signin;
public Redbussignin2(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clicksignin()
{
	signin.click();
}
}
