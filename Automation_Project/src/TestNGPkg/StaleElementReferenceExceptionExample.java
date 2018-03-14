package TestNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testPackage.BaseClass;

public class StaleElementReferenceExceptionExample extends BaseClass {
@Test
public void login()
{
for (int i = 0; i < 10; i++) {
	

	driver.get("https://www.facebook.com/");
	WebElement findElement = driver.findElement(By.id("email"));
	findElement.sendKeys("sh"+i);
	//driver.navigate().refresh();
	WebElement findElement2 = driver.findElement(By.id("pass"));
	findElement2.sendKeys("jskdh"+i);
	driver.findElement(By.id("loginbutton")).click();;
	//driver.navigate().refresh();
}
}
}
