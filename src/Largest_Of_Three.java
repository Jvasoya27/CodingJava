
public class Largest_Of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=30;
		int c=20;
		
		if((a>b) && (a>c))
		{
			System.out.println("A is largest");
		
		}
		else if ((b>a) && (b>c))
		{
			System.out.println("B is largest"); 
		}
		else
		{
			System.out.println("C is largest");
		}
		
		int day=4;
		
		switch(day)
		{
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		default: System.out.println("Saturday");
		}
		
	}


}
