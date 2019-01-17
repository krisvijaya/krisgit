package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signupemail
{
public WebDriver driver;
@FindBy(xpath="//*[@class='signin-screen']")
public WebElement signin2;
public Signupemail(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void clicksignin2()
{
	signin2.click();
}
}
