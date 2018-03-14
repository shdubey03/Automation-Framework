package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgWIthPaRameter {
@Test(priority=1,invocationTimeOut=2)
public void createProduct()
{
Reporter.log("Product is created", true);	
}
@Test(priority=1,invocationTimeOut=200)
public void editProduct()
{
Reporter.log("Product is edited", true);	
}
@Test(priority=1,dependsOnMethods="createProduct")
public void deleteProduct()
{
Reporter.log("Product is deleted", true);	
}
}
