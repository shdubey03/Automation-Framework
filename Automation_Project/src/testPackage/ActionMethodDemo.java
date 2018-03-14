package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://toolsqa.com/selenium-webdriver/browser-navigation-commands/");

		Actions act=new Actions(driver);
		//Context Click
		/*	act.contextClick(driver.findElement(By.xpath("//*[contains(text(),'Browser Commands')]"))).perform();;
		 */
		//moveToElement
		//Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("(.//span[contains(@class,'menu-text')])[2]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("(.//*[contains(text(),'Mobile Testing Tool')])[1]"))).perform();
		Thread.sleep(1000);
		act.moveToElement(driver.findElement(By.xpath("(.//*[contains(text(),'Mobile Application Testing')])[1]"))).perform();
		driver.findElement(By.xpath("(.//*[contains(text(),'Mobile Application Testing')])[1]")).click();
		Thread.sleep(1000);
	//driver.close();
	//driver.switchTo().parentFrame().close();
	}

}
