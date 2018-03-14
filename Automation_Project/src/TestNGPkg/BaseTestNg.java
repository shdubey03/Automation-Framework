package TestNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTestNg{

  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("BeforeMethodofBaseClass......",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AfterMethodofBaseClass......",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("BeforeClassofBaseClass......",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("AfterClassofBaseClass......",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("BeforeTestofBaseClass......",true);
  }

  @AfterTest
  public void afterTest() {Reporter.log("AfterTestofBaseClass......",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("BeforeSuiteofBaseClass......",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuiteofBaseClass......",true);
  }

}
