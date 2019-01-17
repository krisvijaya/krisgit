package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbussignin
{
 public WebDriver driver;
 @FindBy(xpath="//*[@id='i-icon-profile']")
 public WebElement signprofile;
public Redbussignin(WebDriver driver)
{
 this.driver=driver;
 PageFactory.initElements(driver,this);
}
public void clicksignprofile()
{
	signprofile.click();
}
}