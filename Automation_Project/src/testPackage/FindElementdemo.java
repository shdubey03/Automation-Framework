package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementdemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
driver.get("http://google.com/");
driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
Thread.sleep(3000);
int count=0;
List<WebElement> allElements = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
for(WebElement element:allElements)
{
	String text=element.getText();
	System.out.println(text);
	count++;
	if(text.equals("selenium interview questions"))
	{
		element.click();
		
		break;
	}
}
System.out.println(count);

	}

}
