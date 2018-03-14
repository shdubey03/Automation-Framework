package httpway2automation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testPackage.BaseClass;

public class SelectClassMethodDemo extends BaseClass {

	public static void main(String[] args) {
		/*driver.get("http://way2automation.com/way2auto_jquery/tooltip.php");
		System.out.println(driver.findElement(By.id("age")).getAttribute("title"));*/
		driver.get("http://localhost/login.do");
		WebElement findElement = driver.findElement(By.id("keepLoggedInCheckBox"));
		String text = findElement.getAttribute("title");
		System.out.println(text); 
		
	/*	if(findElement.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		*/
		
		//check whether username textbox is active or not
		WebElement findElement2 = driver.findElement(By.id("username"));
		boolean enabled = findElement2.isEnabled();
		if(enabled)
		{
			System.out.println("Username is enabled"); 
			
		}
		else
		{
			System.out.println("Username is not enabled");
		}
	}

}
