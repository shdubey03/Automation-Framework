package testPackage;

public class SwitchToDemo extends BaseClass {

	public static void main(String[] args)  {
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("shdubey03");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
