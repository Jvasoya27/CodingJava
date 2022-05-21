package Homework;

public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Vivek", 10, 20, 20);
		Student s2 = new Student("Jaydeep", 10, 10, 10);
		
		Student[] data = {s1, s2};
		
		int maxmark = 0;
		Student maxmarkStudent = null;
		
		for(Student s : data)
		{
			if(maxmark < s.totalmarks)
			{
				maxmark = s.totalmarks;
				maxmarkStudent = s;
			}
		}
		
		System.out.println("Maximum score ");
		System.out.println("Student name: " + maxmarkStudent.firstname);
		
	}

}
