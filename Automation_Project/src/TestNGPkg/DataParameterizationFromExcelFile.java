package TestNGPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import testPackage.BaseClass;

public class DataParameterizationFromExcelFile extends Base {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void dataParameterizationFromExcelFile(String browser) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		//getting values from propety file
		FileInputStream fis1=new FileInputStream("./ConfigNew.properties");
		Properties prop=new Properties();
		prop.load(fis1);
		String url = prop.getProperty("URL");
		
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		FileInputStream fis=new FileInputStream(".\\TestData\\data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		driver.get(url);

		//driver.get("https://www.makemytrip.com/");
		/*driver.manage().window().maximize();
         Thread.sleep(10000);*/


		PomClassDemoForActiveElement obj=new PomClassDemoForActiveElement(driver);
		obj.setUserName(wb.getSheet("ValidLogin").getRow(1).getCell(0).toString());
		obj.setPassWord(wb.getSheet("ValidLogin").getRow(1).getCell(1).toString());
		obj.setLoginButton();


		obj.setUserName(wb.getSheet("ValidLogin").getRow(2).getCell(0).toString());
		obj.setPassWord(wb.getSheet("ValidLogin").getRow(2).getCell(1).toString());
		obj.setLoginButton();



	}

}
























