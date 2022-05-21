package arrays;

public class TwoDimentional_Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] [] = { {10,20,30}, {40,50,60}, {70,80,90}, {100,89,120} };
		
		for(int i[] : a)
		{
			for(int j : i)
			{
				System.out.print(j + "     ");
			}
			
			System.out.println();
		}
	}

}
