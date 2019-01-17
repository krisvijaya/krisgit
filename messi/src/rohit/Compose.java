package rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Compose
{
public WebDriver driver;
@FindBy(xpath="//*[text()='COMPOSE']")
public WebElement comp;
@FindBy(xpath="//*[contains(@title,'Google Account')]/span" )
public WebElement profile;
@FindBy(xpath="//*[text()='Sign out']")
public WebElement signout;
//public Compose (WebDriver,driver)
{
	
}
}
