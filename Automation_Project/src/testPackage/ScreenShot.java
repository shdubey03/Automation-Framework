package testPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class ScreenShot extends BaseClass {

	public static void main(String[] args) throws IOException {
		driver.get("https://www.gmail.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scrnfile=(File) ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshots/gmailLogin.png");
		FileUtils.copyFile(scrnfile, destFile);
		driver.close();
	}

}
