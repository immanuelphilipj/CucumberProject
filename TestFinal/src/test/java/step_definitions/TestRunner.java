package step_definitions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features ={"src/test/resources/features"},
		 glue={"step_definitions"}
		 //plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)
public class TestRunner {
	
/*	@BeforeClass
	public static void setup() {
	    ExtentProperties extentProperties = ExtentProperties.INSTANCE;
	    extentProperties.setReportPath("output/myreport.html");
	}
*/	
	/* @AfterClass
	    public static void teardown() {
		 System.out.println("Am here");
		    File f = new File("src/test/resources/extent-config.xml");
		    System.out.println(f);
	        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
		    //Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
		    
	    }*/

}
