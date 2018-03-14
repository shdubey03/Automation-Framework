package testPackage;

  import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement des = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des).perform();
		Thread.sleep(5000);
		driver.close();
	} 

}
