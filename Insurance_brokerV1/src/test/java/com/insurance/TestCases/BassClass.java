package com.insurance.TestCases;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.hpsf.Property;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.insurance.utilities.ReadConfig;

import freemarker.log.Logger;

public class BassClass {
    ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getApplicationURL();
	public String username = readConfig.getEmail();
	public String password = readConfig.getPassword();	
	public static WebDriver driver ;
	public static Logger logger ;	
	
//	@Parameters("browser")
	@BeforeClass
	public  void setUP (ITestContext XmlTest) {
				if(XmlTest.equals("edge")) {
		System.setProperty("webdriver.edge.driver",readConfig.getEdgePath());
		driver = new EdgeDriver();
		}
		logger =Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		String log4Jpath = System.getProperty("user.dir")+ "/log4j.properties";
		PropertyConfigurator.configure(log4Jpath);
	} 
@AfterClass
public void tearDown() {	
	driver.quit();
}

}