package com.testNg;

import org.testng.annotations.Test;

public class DepedentTest {

	
	@Test
	public void login()  {
		System.out.println("login methods");
		int a=10/0;
		
		System.out.println(a);
	}
	@Test(dependsOnMethods ="login")
	public void homeTitle() {
		System.out.println("welcome to google");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void validate() {
		System.out.println("validate by name");
		
	}
	@Test
	public void notDepdent() {
		System.out.println("excuite");
	}

}
