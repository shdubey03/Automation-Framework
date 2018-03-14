package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyErrorMessage extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		String text = driver.findElement(By.id("errorSpan")).getText();
		WebElement findElement = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String text2 = findElement.getText();
		System.out.println(text2);
		Thread.sleep(5000);
		System.out.println(text);
		driver.close();
	}

}
