package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModularExecutionDemoA {
	@Test(groups={"user","smoke"})
public void createUser()
{
	Reporter.log("User Created",true);
}
	
	@Test(groups={"user","regression"})
public void editUser()
{
	Reporter.log("User edited",true);
}
	
	@Test(groups={"user","regression"})
public void deleteUser()
{
	Reporter.log("User deleted",true);
}
}
