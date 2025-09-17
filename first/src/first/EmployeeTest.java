package first;
public class EmployeeTest {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("Eshika", "Shukla", 25000);
	        Employee emp2 = new Employee("Aarav", "Verma", 30000);
	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
	                "'s Yearly Salary: " + emp1.getYearlySalary());
	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
	                "'s Yearly Salary: " + emp2.getYearlySalary());
	        emp1.giveRaise(10);
	        emp2.giveRaise(10);
	        System.out.println("\nAfter 10% Raise:");
	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() +
	                "'s Yearly Salary: " + emp1.getYearlySalary());
	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() +
	                "'s Yearly Salary: " + emp2.getYearlySalary());
	    }
	}

