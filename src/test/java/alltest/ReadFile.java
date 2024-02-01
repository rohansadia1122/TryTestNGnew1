package alltest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Properties;

public class ReadFile extends LoginClass {
		
	FileInputStream input;
	Properties prop = new Properties();
	
	
	
	public ReadFile() {
		
	try {
		input = new FileInputStream("C:\\Users\\Mohammad\\eclipse-workspace\\TryTestNGnew\\src\\test\\resources\\Properties\\new.properties");
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	}
	try {
		prop.load(input);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}
public String getUrl() {
	String myUrl = prop.getProperty("url");
	return myUrl;
	
}	

public String getUser() {
	String myUser = prop.getProperty("username");
	return myUser;
	
}	

public String getPass() {
	String myPass = prop.getProperty("password");
	return myPass;
	
}
}
