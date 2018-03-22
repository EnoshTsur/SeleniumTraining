package tests;

import org.testng.annotations.Test;

@Test
public class DataProviderTest {

	@Test(dataProvider = "data-provider" , dataProviderClass = DataProviders.class)
	public void test1(String name , String password , String email) {
		System.out.println("Name: " + name + " , Password: " + password + " , Email: " + email);
	}
	
	
}
