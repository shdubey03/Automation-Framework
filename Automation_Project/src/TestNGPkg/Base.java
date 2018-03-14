package TestNGPkg;

public class Base {
	static {
		System.setProperty("webdriver.chrome.driver", ".\\src\\driver\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver",".\\src\\driver\\geckodriver.exe");
	}
}
