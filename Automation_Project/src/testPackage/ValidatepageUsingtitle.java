package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidatepageUsingtitle extends BaseClass {

	public static void main(String[] args) {
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("//a[contains(text(),'CONTINUE TO LOGIN')]")).click();
		//to validate page using Title
/*String expectedText="State Bank of India - Personal Banking";
String actualText=driver.getTitle();
if(expectedText.equals(actualText))
{
	System.out.println("page is displayed");
}
else
{
	System.out.println("page is not displayed");
}*/
		//to validate page using URL
		
	/*String expUrl="https://retail.onlinesbi.com/retail/login.htm";
	String actUrl=driver.getCurrentUrl();
	if(expUrl.equals(actUrl))
	{
		System.out.println("page is displayed");
	}
	else
	{
		System.out.println("page is not displayed");
	}*/
		
		//to validate page using Unique element
		
		WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'New User ? Register here')]"));
		if(findElement.isEnabled())
		{
			System.out.println("page is displayed");
		}
		else
		{
			System.out.println("page is not displayed");
		}

driver.close();
	}

}
