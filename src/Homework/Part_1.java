package Homework;

class Employee{
	
	int id;
	String name;
	float salary;
	
	void insert(int i, String s, float f) {
		id = i;
		name = s;
		salary = f;
	}
	
	void display() {System.out.println(id + name + salary);}
	
}

public class Part_1 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.insert(012, "raj", 25);
		e1.display();
		
		e2.insert(013, "jay", 43);
		e2.display();
		
		e3.insert(014, "jayraj", 24);
		e3.display();
		
		
		
		System.out.println("Computer science, Yes !!!!");
		
		System.out.println("__________________________________");
		
		System.out.print(" Roses are Red\n Violets are Blue\n Sugar is sweet\n and so are you!\n");
		
		System.out.println("__________________________________");
	}

	public static void poem(String[] args) {
		
	}
	
}


