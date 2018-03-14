package testPackage;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ActiveElementDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')]")).click();
		TargetLocator switchTo = driver.switchTo();
		WebElement activeElement = switchTo.activeElement();
		activeElement.sendKeys("shdubey03");
		Thread.sleep(4000);
		//driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
	}

}
