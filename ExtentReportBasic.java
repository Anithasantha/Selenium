package seleniumExtentReport;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportBasic {
	
	private static WebDriver driver=null;
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReport.html");
		ExtentReports extent=new  ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test=extent.createTest("MyFirstTest","Sample Description" );
		//String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\julin\\web-app\\seleniumExtentReport\\src\\driver\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		test.log(Status.INFO,"Starting test case");
		driver.get("https:\\www.google.com");
		test.pass("Navigate to google com");
		driver.findElement(By.name("q")).sendKeys("extent reports");
		test.pass("Entered text in Searchbox");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		test.pass("Pressed Keyboard enter key");
		test.info("Test Completed");
		extent.flush();
		
		}

}
