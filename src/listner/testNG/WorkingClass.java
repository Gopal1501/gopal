package listner.testNG;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listner.testNG.ListnerOFTestNG.class)
public class WorkingClass {
	int a=9;
	@Test
	
	
	public static void test1() {
		System.out.println("test1");
		
	}
	@Test
	public static void test2() {
		System.out.println("test2");
		
	}

}
