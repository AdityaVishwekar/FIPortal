package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

interface interfaceOne {
	public abstract void display();
	String getMsg(String str);
}

interface interfaceTwo {
	void showInt();
}

class baseClass implements interfaceOne, interfaceTwo {

	@Override
	public void showInt() {
		// TODO Auto-generated method stub
		System.err.println("Integer : 10");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.err.println("InterfaceOne Method");
		
	}

	@Override
	public String getMsg(String str) {
		// TODO Auto-generated method stub
		return str;
	}
	
	
}

public class TestInterface {

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		baseClass obj = new baseClass();
//		obj.display();
//		System.out.println("Value "+obj.getMsg("Method"));
//		obj.showInt();
		
//		interfaceOne obj = new baseClass();
//		obj.display();
//		System.out.println("Value "+obj.getMsg("Method"));
		
//		interfaceTwo obj = new baseClass();
//		obj.showInt();

		driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\aditya\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		driver =new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditya\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		
		
		
	}

}
