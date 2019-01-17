package rohit;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreports
{

	public static void main(String[] args) throws Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a word");
	String x=sc.nextLine();
	//create file extent report
	ExtentReports er=new ExtentReports("srikanthres.html",false);
	ExtentTest et=er.startTest("srikanth title test");
	//launch site 
	System.setProperty("webdriver.chrome.driver","D:\\batch239\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.co.in");
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	//search a word
	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	String y=driver.getTitle();
	if(y.contains(x))
	{
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("passscr.png");
		FileUtils.copyFile(src,dest);
		et.log(LogStatus.PASS,"srikanth test passed");
		et.log(LogStatus.PASS,et.addScreenCapture("passscr.png"));
	}
	else
	{ 
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("failscr.png");
		FileUtils.copyFile(src,dest);
		et.log(LogStatus.FAIL,"srikanth test passed");
		et.log(LogStatus.FAIL,et.addScreenCapture("failscr.png"));	
	}
	//close site
	driver.close();
	er.endTest(et);
	er.flush();
	}

}
