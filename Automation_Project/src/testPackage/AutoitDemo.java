package testPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class AutoitDemo extends BaseClass {

	public static void main(String[] args) throws IOException {
driver.get("https://mail.google.com/mail/u/0/#inbox");
driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).click();
driver.findElement(By.id(":153")).click();
Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\autoit.exe");


	}

}
