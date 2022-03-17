package com.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class propertiesFile {

	static File file = new File ("./Resources/config.properties");
	static FileInputStream fis= null;
	static Properties prop = new Properties();
	
	
	

	static {
		
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	public String getProperty(String key) {
		return prop.getProperty(key);
	}


	
}
