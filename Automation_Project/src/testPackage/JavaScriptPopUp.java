package testPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class JavaScriptPopUp extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.get("http://www.softwaretestinghelp.com/handle-alerts-popups-selenium-webdriver-selenium-tutorial-16/");
		//driver.findElement(By.id("loginbutton")).click();
		//Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		//System.out.println("AAAAAAAA");
		driver.findElement(By.id("jacksonville-field-email"));
		String msg = alert.getText();
		//System.out.println("dddddddddddd");
		System.out.println(msg);
		alert.sendKeys("shdubey03");
		alert.dismiss();
		Thread.sleep(5000);
		driver.close();

	}

}
