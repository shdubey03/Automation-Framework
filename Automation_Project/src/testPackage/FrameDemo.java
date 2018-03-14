package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) {
driver.get("file:///C:/Users/User/Desktop/Frame_Page2.html");
//driver.switchTo().frame(0);
//driver.switchTo().frame("f1");
//driver.switchTo().frame("n1");
	WebElement frameObj=driver.findElement(By.cssSelector("#f1"));
	driver.switchTo().frame(frameObj);
	//driver.findElement(arg0)
	
	}

}
