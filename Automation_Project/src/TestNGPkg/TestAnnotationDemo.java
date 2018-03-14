package TestNGPkg;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class TestAnnotationDemo {
@Test(priority=0,invocationCount=1,enabled=true)
public void createUser()
{
	Reporter.log("CreateUser.......",true);
}
@Test(priority=1,invocationCount=2,enabled=true)
public void editUser()
{
	Reporter.log("editUser........",true);
}
@Test(priority=2,invocationCount=1,enabled=true)
public void deleteUser()
{
	Reporter.log("deleteUser....",true);
}

}
