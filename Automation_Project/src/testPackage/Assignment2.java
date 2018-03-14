package testPackage;

import org.openqa.selenium.By;

public class Assignment2 extends BaseClass {

	public static void main(String[] args) {
driver.get("http://localhost/login.do");
driver.findElement(By.id("username")).sendKeys("Admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
driver.findElement(By.xpath("//div[@class='popup_menu_label'])[1]")).click();;

	}

}
