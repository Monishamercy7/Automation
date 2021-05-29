package com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.codehaus.jackson.JsonParser;

/**
 * 
 * @author Monisha
 *
 */
public class FileUtility {
	/**
	 * This method used to read data from properties and return the value based on key specified
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	
	public String getPrtopertyKeyValue(String key) throws Throwable
	{
		FileInputStream file = new FileInputStream(IPathConstant.PROPERTY_FILEPATH);
		Properties prop = new Properties();
		prop.load(file);
		return prop.getProperty(key);
		}

	/**
	 * This method will return json value based on jason key
	 * @param jsonKey
	 * @return jsonValue
	 * @throws Throwable
	 */
	public String getDataFromJason(String jsonKey) throws Throwable
	{
		FileReader reader = new FileReader(IPathConstant.JSONFILEPATH);
		JsonParser parser = new JasonParser();
		
	}

}
