package TestNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterixationDemoB {
	static{
		System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");// \\ or /while writing path
	}
	static  WebDriver driver;
	String Url="https://www.facebook.com/login/";
	
	@Test(priority=1)
	@Parameters("browser")
	public void launchBroser(String browser)
	{
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get(Url);

		}
		else
		{
			driver=new ChromeDriver();
			driver.get(Url);
		}
	}
@Parameters({"email","pass"})
	@Test(priority=2)
	public void enterLoginCredential(String email1, String pass)
	{

		driver.findElement(By.id("email")).sendKeys(email1);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("loginbutton")).click();
	}


	
}
