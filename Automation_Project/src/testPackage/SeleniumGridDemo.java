package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo extends BaseClass {
	@Test
	@Parameters({"node","browser"})
	public void testSeleniumGrid(String node,String browser) throws MalformedURLException
	{
		URL ob1=new URL(node);
		DesiredCapabilities obj2=new DesiredCapabilities();
		obj2.setBrowserName("browser");
		WebDriver driver =new RemoteWebDriver(ob1, obj2);
		driver.get("https://www.facebook.com/");
	}
}
