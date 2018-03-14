package TestNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PomClassDemoForActiveElement {


	//declaring the element
	@FindBy(id="email")
	WebElement UserName;
	/*@FindBy(id="hp-widget__sfrom")
	WebElement UserName;*/
	
	@FindBy(id="pass")
	WebElement PassWord;
	/*@FindBy(id="hp-widget__sTo")
	WebElement PassWord;*/
	

	@FindBy(id="u_0_2")
	WebElement LoginButton;
	
/*	@FindBy(id="searchBtn")
	WebElement LoginButton;*/
	

	//Initialize The Element

	public PomClassDemoForActiveElement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization of Element

	public void setUserName(String userName)
	{
		UserName.sendKeys(userName);
	}

	public void setPassWord(String passWord)
	{
		PassWord.sendKeys(passWord);
	}

	public void setLoginButton()
	{
		LoginButton.click();
	}

}
