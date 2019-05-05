import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumGuvi {
	public static void main(String[] args) {
		WebDriver driver=null;
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.gecko.driver", "drivers\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.guvi.in");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("login_email")).sendKeys("anithasambasivam@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("12345");
		driver.findElement(By.id("login_button")).sendKeys(Keys.RETURN);
		
		}
}



/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGuvi {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\julin\\web-app\\SeleniumGuvi\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}

}*/
