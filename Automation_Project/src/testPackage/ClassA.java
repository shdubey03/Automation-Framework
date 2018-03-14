package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassA {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver",".\\src\\driver\\chromedriver.exe");// \\ or /while writing path
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();*/
		
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");// \\ or /while writing path
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		//driver.close();
		
		
	}
}
