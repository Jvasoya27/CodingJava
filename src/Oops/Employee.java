package Oops;

public class Employee {

		int empid;
		String empname;
		int salary;
		int depno;
		
		 /*Employee (int id, String name, int sal, int dno)
		 {
		 	empid = id;
		 	empname = name;
		 	salary = sal;
		 	depno = dno;
		 
		 }*/
		
		void setdata (int id, String name, int sal, int dno)
		{
			empid = id;
			empname = name;
			salary = sal;
			depno = dno;
		}
		
		 void display()
		{
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(depno);
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			// Assigning values to class variables using the object
			
			/*Employee emp1 = new Employee();		// First Employee
			emp1.empid = 101;
			emp1.empname = "John";
			emp1.salary = 20000;
			emp1.depno = 43;
			emp1.display();
			
			System.out.println("--------------------");
			
			Employee emp2 = new Employee();		// Second Employee
			emp2.empid = 102;
			emp2.empname = "Johny";
			emp2.salary = 2000;
			emp2.depno = 41;
			emp1.display();*/
			
			// Assigning values to class variables using the constructor
			
			/*Employee emp1 = new Employee (101, "Jay", 2000, 10 );
			emp1.display();
			
			System.out.println("--------------");
			
			Employee emp2 = new Employee (102, "ViJay", 32000, 210 );
			emp2.display();*/
			
			// Assigning values to class variables using method
			
			Employee emp1 = new Employee();
			emp1.setdata (101, "Jay", 2000, 10);
			emp1.display();
			
			System.out.println("--------------");
			
			Employee emp2 = new Employee();
			emp2.setdata(102, "Vijay", 3000, 302);
			emp2.display();
			
			
			
	}

}
