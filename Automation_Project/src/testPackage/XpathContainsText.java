package testPackage;

import org.openqa.selenium.By;

public class XpathContainsText extends BaseClass  {

	public static void main(String[] args) {
driver.get("http://localhost/login.do");
//driver.findElement(By.xpath("//input[@id='username'][@name='username'][@class='textField']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@class='textField pwdfield'][@name='pwd']")).sendKeys("manager");
driver.findElement(By.xpath("//a[@id='loginButton']//div[text()='Login ']")).click();		
	}


}
