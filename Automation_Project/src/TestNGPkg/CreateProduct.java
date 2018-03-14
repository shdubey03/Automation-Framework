package TestNGPkg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateProduct {
	@Test(groups={"product","smoke"})
	public void createProduct()
	{
		Reporter.log("product Created",true);
	}
	@Test(groups={"product","regression"})
	public void editProduct()
	{
		Reporter.log("product edited",true);
	}
	@Test(groups={"product","regression"})
	public void deleteProduct()
	{
		Reporter.log("product delete",true);
	}
	}
