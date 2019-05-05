package testng;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestNG1 {
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\julin\\web-app\\seleniumJavaTestNg\\driver\\geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();		
	}
	@Test
	public void googleSearch() {
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium examples");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
	}
	@AfterTest
	public void tearDownTest() {
		
		System.out.println("Test completed Successfully.");
	}

}
