package testPackage;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;

public class EnteringvalueFocusElement extends BaseClass {

	public static void main(String[] args) {
		driver.get("http://localhost/login.do");
		//only one element is in active mode on a web page
driver.switchTo().activeElement().sendKeys("Shweta");
	}

}
