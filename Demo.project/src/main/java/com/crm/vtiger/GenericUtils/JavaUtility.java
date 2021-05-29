package com.crm.vtiger.GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {

	/*
	 * generate random number
	 * @Monisha
	 * 
	 */
	public static String getRandomData()
	{
		Random random = new Random();
		int ran = random.nextInt(1000);
		return ""+ran;
	}
	
	/*
	 * Generate current system date
	 * @Monisha
	 */
	public String getCurrentSystemDate()
	{
		Date date = new Date();
		String currentDate = date.toString();
		return currentDate;
	}
	
	
	
	
	
}
