package Homework;

public class Student {
	
	String firstname;
	int mathmark; 
	int ecomark; 
	int engmark; 
	int totalmarks; 
	
	public Student (String firstname, int mathmarks, int ecomarks, int engmarks, int totalmarks) {
		this.firstname = firstname;
		this.mathmark = mathmarks;
		this.ecomark = ecomarks;
		this.engmark = engmarks;
		this.totalmarks = this.mathmark + this.ecomark + this.engmark ;
		
	}
	
	public int gettotalmarks() {
		return totalmarks;
	}
	
	
	public void display ()
	{
		System.out.println("Firstname:" + this.firstname);
		System.out.println("Mathmarks:"  + this.mathmark);
		System.out.println("Ecomarks:"  + this.ecomark);
		System.out.println("Enghmarks:"  + this.engmark);
		System.out.println("Totalmarks:"  + this.totalmarks);
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student  ("Vivek", 25, 35, 45, 112);
		
	

	}

}
