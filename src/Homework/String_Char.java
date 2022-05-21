package Homework;

public class String_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is my Homework";
		String rev = "";
		
		
		System.out.println(s.length());
		
		int len = s.length();
		
		for (int i = len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
					
		}
		
		System.out.println ("Reversed string is : " + rev);
		
		
	}
	
			
}
	

	
	

