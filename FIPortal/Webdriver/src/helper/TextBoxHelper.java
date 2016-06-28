package helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class TextBoxHelper extends StartWebDriver{
	
	public static void typeInTextBox(String locator, String value){
		
		if(driver.findElements(By.id(locator)).size()==1) {
			driver.findElement(By.id(locator)).sendKeys(value);
		} else if(driver.findElements(By.className(locator)).size() == 1) {
			driver.findElement(By.className(locator)).sendKeys(value);
		} else if(driver.findElements(By.name(locator)).size() == 1) {
			driver.findElement(By.name(locator)).sendKeys(value);
		} else if(driver.findElements(By.xpath(locator)).size() == 1) {
			driver.findElement(By.xpath(locator)).sendKeys(value);
		} else if(driver.findElements(By.cssSelector(locator)).size() == 1) {
			driver.findElement(By.cssSelector(locator)).sendKeys(value);
		}
		else
			throw new NoSuchElementException("No Such Element"+locator);
	}

}
