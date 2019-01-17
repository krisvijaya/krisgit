package krishnew;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class Testngwithdiff 
{
	public WebDriver driver;
	@DataProvider(name="way2sms")
   public Object[][] Preeti()
   {
		return new Object[][]
				{
		{"8668218023","Preeti123","9404087081","luv u lot krishhhhh"}
   };
}
}
