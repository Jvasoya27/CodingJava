package Oops;

public class Method_Overloading {
	
	int a;
	int b;
	
	void sum()
	{
		a = 10;
		b = 20;
		System.out.println(a+b);
		
	}
	
	void sum(int x, int y)
	{
		int a = x;
		int b = y;
		System.out.println(a + b);
	}
	
	void sum (int x, int y, int z)
	{
		System.out.println(x + y + z);
	}
	
	void sum (int x, double y)
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		
		Method_Overloading mo = new Method_Overloading();
		
		mo.sum();				// Call the First Method
		mo.sum(100 , 200);		// Call the Second Method
		mo.sum(10, 20, 30);		// Call the Third Method
		mo.sum(10, 20.5);		// Call the Fourth Method
		
	}

}
