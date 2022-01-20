package com.testNg;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 5)
	public void repeatmultiple() {
		int a=5;
		int b=6;
		int c=a+b;
		System.out.println(c);
		
	}

	
/*	public void repaetMultiple() {
		int a=1;
		int b=25;
		
		int i=1;
		for(i=1;i<=5;i++) {
		
		
		
		
			int c=a+b;
			
			a=a+10;
			
			System.out.println(c);
		}
		
*/
}

