package testd;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.bytebuddy.asm.Advice.This;
import pages.Homepage;
import pages.Sendsmspage;

public class Gluecode
{
public WebDriver driver;
public WebDriverWait Wait;
public Homepage hp;
public Sendsmspage sp;
public Scenario s;
public Properties pro;
@Before
public void method1(Scenario s)
{
	This.s=
	pro=new Properties();
	FileInputStream fip=new FileInputStream("D:\\batch239\\foodpanda\\src\\test\\resources\\burger.properties");
	pro.load(fip);
}
@Given ("^launch site using \"(.*)\"$")
public void method2(String b)
{
	System.setProperty("WebDriver.chrome.driver",pro.getProperty("cDriver"));
	driver=new ChromeDriver();
	hp=new Homepage(driver);
}

}
