
public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) Using  + (String concatenation) operator
		
		String st = "ABCD";
		String rev = "";
		
		/*int len = st.length();		// 4
		
		for (int i = len - 1; i>0; i--)		// 3 2 1 0 -1
		{
			rev = rev + st.charAt(i);
		}
		
		System.out.println("Reversed String is:" + rev);*/
		
		// 2) Using character array
		
		/*char a[] = st.toCharArray();
		int len = a.length;
		
		for (int i = len-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		
		System.out.println("Reversed string is:" + rev);*/
		
		// 3) Using String Buffer Class
		
		StringBuffer sb = new StringBuffer(st);
		System.out.println(sb.reverse());
		
	}

}
