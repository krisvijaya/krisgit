package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Homepage;
import pages.Loginpage;

public class Gluecode
{
public WebDriver driver;
public WebDriverWait wait;
public Scenario s;
public Properties pro;
public Homepage hp;
public Loginpage lp;
@Before
public void method1(Scenario s) throws Exception
{
	this.s=s;
	pro=new Properties();
	FileInputStream fip=new FileInputStream("D:\\sravan\\vijaya\\target\\test-classes\\kris.properties");
	pro.load(fip);
}
@Given("^launch site using\"(.*)\"$")
public void method2()
{
System.setProperty("WebDriver.chrome.driver",pro.getProperty("cdriver"));
driver=new ChromeDriver();
hp=new Homepage(driver);
lp=new Loginpage(driver);
driver.get(pro.getProperty("url"));
wait=new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOf(hp.uid));
driver.manage().window().maximize();
}
@Then("^title contains\"(.*)\"$")
public void method3(String a)
{
	wait.until(ExpectedConditions.visibilityOf(hp.uid));
	String t=driver.getTitle();
	if(t.contains(a))
	{
		s.write("title test passed");
	}
	else
	{
		byte ssbytes[]=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.embed(ssbytes, "");
	}
}
@And("^close site\"(.*)\"$")
public void method4()
{
 driver.close();
}
}
