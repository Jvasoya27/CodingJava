
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20; 
		
		
		//	ARITHMATIC OPERATORS ----> + - * / %
		
		System.out.println("----------These are Arithmatic Operators----------");
		System.out.println("some of a and b is :" + (a+b));
		System.out.println("Diff of b and a is :" + (b-a));
		System.out.println("Multi of a and b is :" + (a*b));
		System.out.println("Div of a and b is :" + (a/b));
		System.out.println("Mod of a and b is :" + (a%b));
		
		//	RELATIONAL OPERATORS (COMPARISON OPERATORS)----> == <> <= >= !=
		//	Always written boolean value
		
		System.out.println("----------These are Relational/Comparison Operators----------");
		System.out.println("a and b are same?:" + (a==b));
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		
		// 	LOGICAL OPERATORS ----> &&  ||  !
		//	Works between two boolean 
		
		boolean x=true;
		boolean y=false;
		
		System.out.println("----------These are Logical Operators----------");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!y);
		System.out.println(y && x);
		System.out.println(!x);
		
		// INCREMENT/DECREMENT OPERATORS ----> ++ --
		
		System.out.println("----------These are Increment/Decrement Operators----------");
		
		a=10;
		//a=a+5;
		a++;
		
		System.out.println(a);
		
		b=20;
		//b=b-5;
		b--;
		
		System.out.println(b);
		
		// ASSIGNMENT OPERATORS ----> =
		System.out.println("----------These are Assignment Operators----------");
		
		System.out.println("The a=10 so the = is an assignment operator");
		
		int j=10;
		int v=20;
		
		int c=10;
		 
		System.out.println(c);
	
	}

}
