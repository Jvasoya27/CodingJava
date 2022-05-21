package Oops;

public class Calculation {

		int a;
		int b;
		
		//1) Method may not take parameters - empty parameters
		
		/*void sum()
		{
			System.out.println(a+b);	
		}*/
		
		//2) Method take parameters
		
				/*void sum(int x, int y)
				{
					a = x;
					b = y;
					System.out.println(a+b);	
				}*/
	
		//3) Method returns some values
		
		int sum()
		{
			return(a+b);
		}
		
		
		
		
		
		
		public static void main(String[] args) {
			
			Calculation cal = new Calculation();
			/*(1)cal.a = 100;
			cal.b = 200;
			cal.sum();*/
			
			//(2)cal.sum(100, 200);
			
			cal.a = 100;
			cal.b = 200;
			int r = cal.sum();
			
			System.out.println(r);
		 
	}

}
