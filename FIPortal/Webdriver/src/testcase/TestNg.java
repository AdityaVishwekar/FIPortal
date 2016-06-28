package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg {

	private static WebDriver driver = null;
	
	@BeforeClass
	public static void startWebDriver() {
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("default");
		profile.setPreference("browser.startup.homepage", "mail.google.com");
		profile.setPreference("browser.download.defaultFolder", "C:\\");
		profile.setPreference("browser.downloa.panel.shown", true);
		profile.setPreference("javascript.enabled", true);
		
		ChromeOptions opt = new ChromeOptions();
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\aditya\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new FirefoxDriver(profile);
//	    driver = new ChromeDriver(opt);
//		driver = new HtmlUnitDriver();
	}
	
	@Test
	public void testCase1() {
		
		driver.get("https://www.google.com");
		System.out.println("Title :"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Google");
		try {
			Thread.sleep(3000);
		}
		catch(Exception e) {}
		driver.get("https://www.yahoo.com");
		System.out.println("Title :"+driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getTitle(), "Yahoo");
	}
	
	@AfterClass
	public static void stopWebDriver() {
		driver.close();
		driver.quit();
		if(driver != null ) {
		driver = null;
		}
	}
}
