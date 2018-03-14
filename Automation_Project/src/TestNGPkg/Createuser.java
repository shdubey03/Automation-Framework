package TestNGPkg;
import org.testng.Reporter;
import  org.testng.annotations.Test;
public class Createuser {
	@Test(groups={"users","smoke"})
	public void createUser()
	{
		Reporter.log("User Created",true);
	}
	@Test(groups={"users","regression"})
	public void editUser()
	{
		Reporter.log("User edited",true);
	}
	@Test(groups={"users","regression"})
	public void deleteUser()
	{
		Reporter.log("User delete",true);
	}
	}


