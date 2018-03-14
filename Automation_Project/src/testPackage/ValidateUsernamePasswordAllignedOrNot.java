package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidateUsernamePasswordAllignedOrNot extends BaseClass {

	public static void main(String[] args) {
driver.get("https://retail.onlinesbi.com/retail/login.htm");
driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')]")).click();
WebElement unTB = driver.findElement(By.id("username"));
WebElement pwTB = driver.findElement(By.id("label2"));
int unXcord=unTB.getLocation().getX();
int pwXcord=pwTB.getLocation().getX();
int unHeight=unTB.getSize().getHeight();
int pwHeight=pwTB.getSize().getHeight();
int unWidth=unTB.getSize().getWidth();
int pwWidth=pwTB.getSize().getWidth();
if(unXcord==pwXcord && unHeight==pwHeight && unWidth==pwWidth)
{
	System.out.println("username and password textbox are alligned");
}
else
{
	System.out.println("username and password textbox are not alligned");
}


	}

}
