package testPackage;

 import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethodDEmo2 extends BaseClass {
	

		public static void main(String[] args) {
			driver.get("file:///C:/Users/User/Desktop/ListBOX.html");
	Select s=new Select(driver.findElement(By.id("mtr")));
	s.selectByIndex(3);
	s.selectByIndex(1);
	s.deselectByIndex(1);
	s.selectByValue("i");;
	List<WebElement> options = s.getOptions();
	for(WebElement wb:options)
	{
		System.out.println(wb.getText());
	}
	
	ListIterator itr=options.listIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	
	
	
	
//we cannot use iterator on select class???
	
	ListIterator<WebElement> findElement = driver.findElements(By.id("mtr")).listIterator();
while(findElement.hasNext())
{
	WebElement next = findElement.next();
	System.out.println(next.getText());
}
	
		}

	}


