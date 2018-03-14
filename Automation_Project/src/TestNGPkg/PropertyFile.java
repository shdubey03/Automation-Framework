package TestNGPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFile {
@Test
public void dataFromConfigFile() throws IOException
{
	FileInputStream fis=new FileInputStream("./ConfigNew.properties");
	Properties prop=new Properties();
	prop.load(fis);
	prop.getProperty("URL");
}
}
