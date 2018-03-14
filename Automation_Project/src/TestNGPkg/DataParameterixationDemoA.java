package TestNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterixationDemoA {
		static
	{
			System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");// \\ or /while writing path
	}

	static WebDriver driver1=new FirefoxDriver();
	@BeforeClass
	public void launchBroser()
	{
		String Url="https://www.facebook.com/login/";
		driver1.get(Url);

	}
	@Parameters({"email","pass"})
	@Test
	public void enterLoginCredential(String email1,String pass)
	{
		driver1.findElement(By.id("email")).sendKeys(email1);
		driver1.findElement(By.id("pass")).sendKeys(pass);
		driver1.findElement(By.id("loginbutton")).click();

	}


	@AfterMethod()
	public void closeBroser()
	{
		driver1.close();
	}
}
