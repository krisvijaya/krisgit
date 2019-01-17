package way2smspages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Way2smsdifferentclass
{
	public WebDriver driver;
	@DataProvider(name="way2sms")
	public Object[][] srikanth()
	{
		return new Object[][]
	{
	{"8341111338","E2832M","8179945045","hai"}
	};
	}
}
