package eg2;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(100,"Sowkya");
		System.out.println("Printing e1");
		e1.printEmployee();
		Employee e2=new Employee(100,"Sowkya",20,"Nellore","kovur");
		System.out.println("\nPrinting e2");
		e2.printEmployee();
		
		
	}

}
