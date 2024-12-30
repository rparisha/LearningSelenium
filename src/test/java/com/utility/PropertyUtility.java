package com.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	
	public static String getData(String key) throws IOException {
		
		//Create File class object
		File file = new File("C:\\Users\\HEMANTH\\OneDrive\\Documents\\TestData.properties");
				
		//File reader class object
		FileReader reader = new FileReader(file);
				
		//Properties class object
		Properties prop = new Properties();
				
		//Load Properties file
		prop.load(reader);
		
		//Call getValue()
		return (String) prop.get(key);
	
	}

}
