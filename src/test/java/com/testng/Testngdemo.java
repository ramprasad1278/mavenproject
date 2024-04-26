package com.testng;
import org.testng.annotations.Test;
public class Testngdemo {

	
	
	


		
		@Test(priority = 2)
		public void testcase1()
		{
			
			System.out.println("Welcome to Maven!!!!!!!");
			
		}
	@Test(priority = 1)

		public void testcase2(){
		System.out.println( "test case 2 executed");
		
	} 
		
	
	
	@Test(priority =-1)
	
public void testcase3()
{
	
	System.out.println("Test case 3");
}


}
