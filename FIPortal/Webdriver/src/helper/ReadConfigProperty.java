package helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigProperty {

	protected InputStream input = null;
	protected Properties prop = null;
	
	public ReadConfigProperty() {
		// TODO Auto-generated method stub
		try {
			input = ReadConfigProperty.class.getClassLoader().getResourceAsStream("resource/config.properties");
			prop = new Properties();		
			prop.load(input);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getUrl() {
		if(prop.getProperty("url")== null) 
			return "";
		return prop.getProperty("url");
	}
	
	public String getBrowser() {
		if(prop.getProperty("browser")== null) 
			return "";
		return prop.getProperty("browser");
	}
	
	public String getEmail() {
		if(prop.getProperty("email")== null) 
			return "";
		return prop.getProperty("email");
	}
	
	public String getPassword() {
		if(prop.getProperty("Password")== null) 
			return "";
		return prop.getProperty("Password");
	}
	
		
	}


