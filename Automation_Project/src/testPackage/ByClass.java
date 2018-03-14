package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ByClass extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://www.facebook.com/");
		
//driver.findElement(By.id("email")).sendKeys("shdubey03@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("Zaq12wsx");
//driver.findElement(By.id("loginbutton")).click();
//driver.close();
driver.findElement(By.linkText("Forgotten account?")).click();
driver.findElement(By.id("identify_email")).sendKeys("shdubey03@gmail.com");
driver.findElement(By.id("u_0_2")).click();
	}

}
