package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import shrirame1.Homepage;
import shrirame1.Sendmsgpage;

public class Glucode 
{
	public WebDriver driver;
	public WebDriverWait wait;
	public Homepage hp;
	public Sendmsgpage sp;
	public Scenario s;
	public Properties pro;
	@Before
	public void method(Scenario s) throws Exception 
	{
		this.s=s;
		pro = new Properties();
		FileInputStream fip = new FileInputStream("D:\\sravan\\shrirame\\src\\test\\resources\\bddpackage\\preethi.properties");
		pro.load(fip);
	}
	@Given("^launch site using \"(.*)\"$")
	public void method2(String b)
	{
		if(b.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\batch239\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		if(b.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\batch239\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	
	hp = new Homepage(driver);
	sp = new Sendmsgpage(driver);
	driver.get(pro.getProperty("url"));
	wait=new WebDriverWait(driver , 20);
	wait.until(ExpectedConditions.visibilityOf(hp.mbno1));
	}
	@Then("^Tittle contains \"(.*)\"$")
	public void method3(String a)
	{
	wait.until(ExpectedConditions.visibilityOf(hp.mbno1));
	String t = driver.getTitle();
	if(t.contains(a))
	{
		s.write("Tittle test is passed");
	}
	else
	{
		byte ssbytes[] = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		s.embed(ssbytes,"Tittle test Failed");
		Assert.fail();
	}
	}
	@And("^close site$")
	public void method4()
	{	
	driver.close();	
	}
	@When("^enter a mobile number as \"(.*)\"$")
	public void method5(String u)
	{
		wait.until(ExpectedConditions.visibilityOf(hp.mbno1));
		hp.fillmbno1(u);
	}
	@And("^enter password as \"(.*)\"$")
	public void method6(String v)
	{
		wait.until(ExpectedConditions.visibilityOf(hp.pwd1));
		hp.fillpwd1(v);
	}
	@And("^click on login $")
	public void method7()
	{
		wait.until(ExpectedConditions.visibilityOf(hp.login1));
		hp.clicklogin1();
		
	}
	@Then("^validate output criteria \"(.*)\" $")
	public void method8(String c) throws Exception
	{

		//wait.until(temp-->((JavascriptExecutor)driver).executeScript("returndocument.readystate").equals("complete"));
		Thread.sleep(3000);
		try
		{
			if(c.equals("All_valid") && sp.send_sms.isDisplayed())
			{
				s.write("test is passwd for valid data");
			}
			else if(c.equals("All_valid") && driver.findElement(By.xpath("(//*[@href='sent-sms'][@class='active'])[1]")).isDisplayed());
			{
				s.write("Test passed for all_valid test");
			}
			//else if(c.equals("mobno_blank") && hp.blank_mbno.isDisplayed())
		    if(c.equals("blank_mbno") && hp.blank_mbno.isDisplayed())
			{
				s.write("test passed for blank mobile no");
			}
			else if(c.equals("pwd_blank") && hp.blank_pwd.isDisplayed())
			{
				s.write("test passed for blank password");
			}
			else if(c.equals("Invalid_mobno") && hp.invalid_mbno.isDisplayed())
			{
				s.write("test passed for invalid mobile no");
			}
			else if(c.equals("Invalid_pwd") && hp.invalid_pwd.isDisplayed())
			{
				s.write("test passed for invalid password");
			}
			else
			{
				byte ssbytes[] = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
				s.embed(ssbytes,"Tittle test Failed");
				Assert.fail();
				
			}
			
		}
		catch(Exception ex) 
		{
			byte ssbytes[] = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(ssbytes,"Tittle test Failed");
			Assert.fail();
		}
		
	}
	@When("^do login with valid data$")
	public void method9(DataTable dt)
	{
		List<List<String>> l=dt.asLists(String.class);
		hp.fillmbno1(l.get(1).get(0));
		hp.fillpwd1(l.get(1).get(1));
		hp.clicklogin1();
	}
	@And("^do logout$")
	public void method10()
	{
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='Logout'][@class='logout']"))).click();
		//wait.until(temp-->((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"));
    }	
	@Then("^home page respond$")
	public void method11()
	{
		if(hp.mbno1.isDisplayed())
		{
			s.write("logout successfully");
		}
		else
		{
			byte ssbytes[] = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			s.embed(ssbytes,"Tittle test Failed");
			Assert.fail();
		}
	}
	

}
