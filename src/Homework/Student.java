package Homework;

import java.util.Scanner;

public class Student {
	
	public String firstname;
	public int mathmark; 
	public int ecomark; 
	public int engmark; 
	public int totalmarks; 
	
	public Student() {}
	public Student (String firstname, int mathmarks, int ecomarks, int engmarks) {
		this.firstname = firstname;
		this.mathmark = mathmarks;
		this.ecomark = ecomarks;
		this.engmark = engmarks;
	}
	
	public int gettotalmarks() {
		this.totalmarks = this.mathmark + this.ecomark + this.engmark ;	
		return totalmarks;
	}
	
	public void display ()
	{
		//Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  

		System.out.println("Firstname: " + this.firstname );
		//this.firstname = sc.nextLine();
		System.out.println("Mathmarks: " + this.mathmark );
		//this.mathmark = sc.nextInt();
		System.out.println("Ecomarks: " + this.ecomark  );
		//this.ecomark = sc.nextInt();
		System.out.println( "Enghmarks: " + this.engmark );
		//this.engmark = sc.nextInt();
		//this.totalmarks = this.mathmark + this.ecomark + this.engmark ;	
		System.out.println("Your Totalmarks is: " + this.totalmarks);
	}
	
	public static void main(String[] args) {

		Student s1 = new Student("Vivek", 10, 20, 20);
		s1.gettotalmarks();
		s1.display();
		
		System.out.println("--------------------");
		
		Student s2 = new Student("Jaydeep", 10, 10, 10);
		s2.gettotalmarks();
		s2.display();
	}
}


