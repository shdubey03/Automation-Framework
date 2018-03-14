package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends BaseClass {

	public static void main(String[] args) {
driver.get("https://www.w3schools.com/html/html_tables.asp");
//print number of rows
 List<WebElement> noRows = driver.findElements(By.xpath("//*[@id='customers']//tr"));
 System.out.println(noRows.size());
 List<WebElement> noCols = driver.findElements(By.xpath("//*[@id='customers']//th"));
 System.out.println(noCols.size());
 //print all the cell values
 List<WebElement> noCell = driver.findElements(By.xpath("//*[@id='customers']//td|//th"));
 System.out.println(noCell.size());
 for(WebElement cell:noCell)
 {
	 String text=cell.getText();
	 System.out.println(text);
 
 //print only numeric value
 try{
	 int num=Integer.parseInt(text);
	 System.out.println(num);
 }
 catch (Exception e) {//NumberFormatException
	// TODO: handle exception
}
 }
	}

}
