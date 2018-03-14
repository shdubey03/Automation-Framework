package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class FindElementHiddenLink extends BaseClass {

	public static void main(String[] args) {
driver.get("http://google.com/");
List<WebElement> allElement = driver.findElements(By.xpath("//a"));
int count=0;
int size=allElement.size();
System.out.println(size);
for (WebElement element : allElement) {
	String text=element.getText();
	System.out.println(text);
	if(!text.isEmpty())
	{
	count++;	
	}
	
}
System.out.println(count);
System.out.println(size-count);

	}

}
