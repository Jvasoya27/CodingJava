package arrays;

public class For_Each_loop_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a[] = new int[5];
		
		int a[] = {10,20,30,40,50}; // We can store any numbers of elements
		
		int sum=0;
		for(int i:a)
		{
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println(sum);
	}

}
