package test;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class YouTubeOpener {

	
	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=I8XXfgF9GSc");
		driver.findElement(By.id("info")).click();
		//driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[3]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/yt-icon-button/button/yt-icon")).click();
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[3]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/yt-icon-button/button/yt-icon")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/ytd-popup-container[1]/iron-dropdown[1]/div[1]/ytd-menu-popup-renderer[1]/paper-listbox[1]/ytd-menu-service-item-renderer[1]/paper-item[1]/yt-formatted-string[1]")).click();
		
		driver.wait();
		driver.close();
	
		WebElement e=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[3]/div[1]/div/div[5]/div[2]/ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/yt-icon-button/button/yt-icon"));
		Select op=new Select(e);
		op.selectByValue("Open");
		//op.selectByIndex(1);
		driver.close();

		System.out.println("3");	
		System.out.println("exit");
	}
	}

