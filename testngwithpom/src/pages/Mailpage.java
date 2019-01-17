package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mailpage
{
	//Locating Elements
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='Compose']")
	public WebElement comp;
	
	/*@FindBy(name="to")
	public WebElement toaddress;
	
	@FindBy(name="subjectbox")
	public WebElement subject;
	
	@FindBy(xpath="//*[@role='textbox']")
	public WebElement body;
	
	@FindBy(xpath="//*[@aria-label='Attach files']/div/div/div")
	public WebElement attachment;
	
	@FindBy(xpath="//*[text()='Send']")
	public WebElement send;*/
	
	public  Mailpage(WebDriver driver)
	 {
		 this.driver= driver;
		 PageFactory.initElements(driver,this);
	 }
	
	/*public void clickoncompose()
	{
		comp.click();
	}
	public void fillto(String x, String y, String z)
	{
		toaddress.sendKeys(x,y,z);
	}
	public void fillsubject(String x)
	{
		subject.sendKeys(x);
	}
	public void fillbody(String x)
	{
		body.sendKeys(x);
	}
	public void clickonattachment()
	{
		attachment.click();
	}
	public void clickonsendbutton()
	{
		send.click();
	}

	public void fillto(String t1, Keys enter, String t2, Keys enter2, String t3) 
	{
		toaddress.sendKeys(t1,t2,t3);
		
	}
*/


	
}

