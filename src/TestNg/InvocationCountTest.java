package TestNg;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("Sum of a and b is :" + c);
		
	}
	
	@Test(invocationCount = 20)
	public void sum2() {
		int a = 100;
		int b = 20;
		int c = a + b;
		
		System.out.println("Sum of a and b is :" + c);
		
	}
	
}
