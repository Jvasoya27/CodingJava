package arrays;

public class String_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s [] = new String[3];
		
		s[0] = "welcome";
		s[1] = "to the";
		s[2] = "training";
		
		System.out.println(s.length);  // returns length of an array  
		
		for(String i:s)
		{
			System.out.println(i);
		}
		
	}

}
