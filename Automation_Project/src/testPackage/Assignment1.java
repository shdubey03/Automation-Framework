package testPackage;

import org.openqa.selenium.By;

public class Assignment1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Javascript (Node)']/..//td/a[text()='Download']")).click();
		
		
		
	}

}
