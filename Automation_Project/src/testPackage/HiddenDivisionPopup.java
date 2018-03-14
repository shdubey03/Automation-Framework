package testPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HiddenDivisionPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.cleartrip.com/");

	/*	String selectDate="12/31/2018";
		Date date=new Date(selectDate);
		SimpleDateFormat dt=new SimpleDateFormat("MM/DDD/YYYY");
		String date1=dt.format(date);
		System.out.println(date1);

		String split[]=date1.split("/");
		String month=split[0];*/

		//System.out.println("Selected month is "+month);
	driver.findElement(By.id("OneWay"));
		System.out.println("XXXX");
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		driver.findElement(By.id("ToTag")).sendKeys("Delhi");

		driver.findElement(By.id("DepartDate")).click();

		driver.findElement(By.linkText("Cal")).click();
	



		/*while(true)
		{
			try{
				driver.findElement(By.xpath("//div//span[@class='"+month+"'")).isDisplayed();
				System.out.println("Selected date is "+split[1]);

				driver.findElement(By.xpath("//td//a[text()='"+split[1]+"']")).click();
			}

		catch(Exception e)
		{		

			driver.findElement(By.xpath("//div//a[@class='nextMonth ']")).click();
		}
	}*/
	}
}

