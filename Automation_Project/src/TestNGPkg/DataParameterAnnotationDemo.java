package TestNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.remote.server.handler.html5.ClearLocalStorage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataParameterAnnotationDemo {
	@DataProvider
	public Object[][] databank()
	{
		Object obj[][]=new Object[3][2];
		obj[0][0]="shd";
		obj[0][1]="ferw";
		obj[1][0]="vfdgvdf";
		obj[1][1]="dfvgdf";
		obj[2][0]="shdubey03";
		obj[2][1]="heriuhg";
		return obj;
	}

	static
	{
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");// \\ or /while writing path
	}

	static WebDriver driver1=new FirefoxDriver();
	@BeforeMethod
	public void launchBroser()
	{
		String Url="https://www.facebook.com/login/";
		driver1.get(Url);

	}

	@Test(dataProvider="databank")
	public void testLogin(String userName,String passWord)
	{
		driver1.findElement(By.id("email")).sendKeys(userName);
		driver1.findElement(By.id("pass")).sendKeys(passWord);
		driver1.findElement(By.id("loginbutton")).click();
	
	}
	
/*	@AfterMethod
	public void closeBrowser()
	{
		driver1.close();
	}*/

	
}
