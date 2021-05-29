package com.crm.vtiger.GenericUtils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClasss {

	
	@BeforeSuite
	public void configBS()
	{
		//connect to DB
	}
	
	@BeforeTest
	public void configBT()
	{
		//launch browser in parallel mode
	}
	
	
	
	@BeforeClass
	public void configBC()
	{
		
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login");
	}
	
	
	@Test
	public void CreateUser()
	{
		System.out.println("user created");
	}
	
	@Test
	public void ModifyUser()
	{
		System.out.println("user modified");
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("launch the browser");
	}
	
	
	@AfterSuite
	public void closeDatabase()
	{
		System.out.println("database closed");
	}
	



}
