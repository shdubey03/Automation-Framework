package TestNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaring the element
	@FindBy(id="email")
	WebElement unTB; 
	
	@FindBy(id="pass")
	WebElement pwTB;
	
	@FindBy(id="u_0_2")
	WebElement logBT;

	//initializing the element
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
	
	//utilization of element
	public void setUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		logBT.click();;
	}
	
}
