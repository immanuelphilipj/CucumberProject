package helpers;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	public static void Screenshot(WebDriver driver, String testname) throws Exception{
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =  ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshot_folder/"+testname+"facebook.png"));
		
	}
	
}
