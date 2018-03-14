package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	static {
		//System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");
	}
public	static WebDriver driver=new FirefoxDriver();
	//public static WebDriver driver=new ChromeDriver();
	
}
