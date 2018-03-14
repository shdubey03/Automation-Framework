package TestNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RunTestScriptInParallel_Testng {
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");
	}
@Parameters("browser")
@Test
public void launchMultipleBrowser(String browser) throws InterruptedException
{
	if(browser.equals("firefox"))
	{
		driver=new FirefoxDriver();	
	}
	else 
	{
		driver=new ChromeDriver();
	}
	driver.get("https://www.facebook.com/");
	WebElement obj=driver.findElement(By.id("email"));
	for (int i = 0; i < 10; i++) {
		obj.sendKeys("admin"+i);
		Thread.sleep(2000);
		obj.clear();
		
	}
}
}
