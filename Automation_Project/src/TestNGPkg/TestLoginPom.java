package TestNGPkg;

import org.testng.annotations.Test;

import testPackage.BaseClass;

public class TestLoginPom extends BaseClass {
	@Test
	public void testLogin()
	{
		driver.get("https://www.facebook.com/");
		LoginPage l=new LoginPage(driver);
		l.setUsername("shdubey03");
		l.setPassword("zaq12wsx");
		l.clickLogin();
	}

}
