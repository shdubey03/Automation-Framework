package TestNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
public class TestNgA extends BaseTestNg {
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("BeforeMethodofA......",true);
	}
	@Test
	public void testA(){
Reporter.log("testing method testA...",true);
		
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("AfterMethodofA......",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("BeforeClass Of Testng class A", true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("AfterClass Of Testng class A", true);
	}
}
