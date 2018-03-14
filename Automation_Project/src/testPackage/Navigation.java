package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigation extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.gmail.com");
	driver.navigate();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
