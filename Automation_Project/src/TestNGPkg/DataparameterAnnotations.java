package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataparameterAnnotations {
	@DataProvider
	public Object dataBank()
	{
		Object[][] obj=new Object[2][3];
		obj[0][0]="admin123";
	obj[0][1]="Manager123";
		obj[0][2]="NewManager123";
		obj[1][0]="admin321";
		obj[1][1]="Manager321";
		obj[1][2]="NewManager321";
		return obj;
	}
	
	@Test(dataProvider="dataBank")
	public void testLogin(String un,String Pwd,String fpwd)
	{
		Reporter.log(un+" "+Pwd+ " "+fpwd);
	}
}