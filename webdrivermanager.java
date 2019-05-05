import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	WebDriver driver=null;
	@BeforeTest
	public void setUpTest() {
			 
		// Webdriver using chrome
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	@Test
	public void  googleSearch() {
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://www.google.com");
		//driver.findElement(By.id("identifierId")).sendKeys("anithasambsivam@gmail.com");
		//WebElement searchIcon = driver.findElement(By.className("hiddenPassword"));
				//id("login-signin"));//id locator for next button
		//searchIcon.click(');
		System.out.println("hello world");
	}
	@AfterTest
	public void teatTestDown() {
		
		driver.close();
		driver.quit();
	}
		/*WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();
		driver.quit();*/
	}

