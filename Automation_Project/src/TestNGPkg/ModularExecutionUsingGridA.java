package TestNGPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class ModularExecutionUsingGridA {
	@Parameters({"node","browser"})
	@Test
	public void ModularExecutionUsingGrid(String node,String Browser) throws MalformedURLException
	{
		
		URL system=new URL(node);
		DesiredCapabilities browser=new DesiredCapabilities();
		browser.setBrowserName(Browser);
		WebDriver rm=new RemoteWebDriver(system, browser);
		rm.get("https://www.facebook.com/");
	}
}
