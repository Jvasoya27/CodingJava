package Homework;

public class String_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is my Homework";
		String rev = "";
		
		
		System.out.println(s.length());
		
		int leng1 = s.length();
		
		for (int i = leng1-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
					
		}
		
		System.out.println ("Reversed string is : " + rev);
		
		System.out.println("--------------------------------------------------");
		
		
		for (int i=0; i<=10; i++) {
			
			if(i%2==0) {
				
				System.out.println( i);
				
			}
			
		}
		
	}
	
			
}
	

	
	

