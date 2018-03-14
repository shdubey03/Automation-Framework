package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ModularExecutionDemoB {
	@Test(groups={"Product","smoke"})
	public void createProduct()
	{
		Reporter.log("Product Created",true);
	}
		
		@Test(groups={"Product","regression"})
	public void editProduct()
	{
		Reporter.log("Product edited",true);
	}
		
		@Test(groups={"Product","regression"})
	public void deleteProduct()
	{
		Reporter.log("Product deleted",true);
	}
}
