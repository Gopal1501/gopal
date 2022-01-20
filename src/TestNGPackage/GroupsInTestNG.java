package TestNGPackage;

import org.testng.annotations.Test;
@Test(groups= {"all class test"})
public class GroupsInTestNG {
	@Test(groups= {"window.sanity"})
	public static void test1() {
		System.out.println("test1");
	}
	@Test(groups= {"sanity","smoke"})
	public static void test2() {
		System.out.println("test2");
	}
	@Test(groups= {"window.regration"})
	public static void test3() {
		System.out.println("test3");
	}
	@Test
	public static void test4() {
		System.out.println("test5");
	}

}
