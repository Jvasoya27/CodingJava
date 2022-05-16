package arrays;	

public class Object_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Object a[] = new Object[5];
		
		a[0] = 10;			//integer
		a[1] = 20.5;		//Double
		a[2] = true;		//Boolean
		a[3] = "Welcom";	//string
		a[4] = "W";			//Char*/
		
		Object a[] = {100, 20.5, true, "Welcome", "w"};
		
		for(Object i : a)
		{
			System.out.println(i);
		}
		
	}

}
