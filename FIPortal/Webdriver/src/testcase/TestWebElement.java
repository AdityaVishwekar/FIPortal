package testcase;

import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.StartWebDriver;
import helper.TextBoxHelper;

public class TestWebElement extends StartWebDriver {
	
	@Test
	public void findElement() {
		
		try {
			driver.get("http://hetzner.buzzpoints.com:3010/");
//			WebElement ele = driver.findElement(By.id("usernameSignIn"));
//			ele.sendKeys("admincadence");
//			driver.findElement(By.id("usernameSignIn")).sendKeys("admincadence");
			TextBoxHelper.typeInTextBox("usernameSignIn", "admincadence");
			
		} catch(NoSuchElementException e) {
			e.printStackTrace();
			
		}
	}

}
