package TestNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import testPackage.BaseClass;

public class PomClassExecutionFromTestNg extends BaseClass {
@Test
public void pomTestExecution() throws EncryptedDocumentException, InvalidFormatException, IOException
{

	driver.get("https://www.facebook.com/");
	PomClassDemoForActiveElement obj=new PomClassDemoForActiveElement(driver);	
	obj.setUserName("shchoubey89@gmail.com");
	obj.setPassWord("mko09ijnhuy");
	obj.setLoginButton();
	
}
}
