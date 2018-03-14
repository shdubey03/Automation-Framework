package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngB extends BaseTestNg{
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("BeforeMethod of class B......",true);
	}
	@Test
	public void testB(){
Reporter.log("testing method testB...",true);
		
	}
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("AfterMethod of class B......",true);
	}
}
