package eg2;

public class Employee {

		
		private int id;
		private String name;
		private int age;
		private String city;
		private String designation;
		public Employee(int id,String name) {
	
			this.id=id;
			this.id=id;
		}
		public Employee(int id,String name,int age,String city) {
			this(id,name);
			this.age=age;
			this.city=city;
		}
		public Employee(int id,String name,int age,String city,String designation) {
			this(id,name);
			this.age=age;
			this.city=city;
			this.designation=designation;
		}
		public void printEmployee() {
			System.out.println("id =" +id);
			System.out.println("name =" +name);
			System.out.println("age =" +age);
			System.out.println("city =" +city);
			System.out.println("designation =" +designation);
			
				
			}
	}
