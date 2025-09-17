package first;
public class Employee {
	    String firstName;
	    String lastName;
	    double monthlySalary;
	    Employee(String fName, String lName, double mSalary) {
	        firstName = fName;
	        lastName = lName;
	        if (mSalary > 0) {
	            monthlySalary = mSalary;
	        } else {
	            monthlySalary = 0.0;
	        }
	    }
	    void setFirstName(String fName) {
	        firstName = fName;
	    }
	    String getFirstName() {
	        return firstName;
	    }	   
	    void setLastName(String lName) {
	        lastName = lName;
	    }
	    String getLastName() {
	        return lastName;
	    }	  
	    void setMonthlySalary(double mSalary) {
	        if (mSalary > 0) {
	            monthlySalary = mSalary;
	        } else {
	            monthlySalary = 0.0;
	        }
	    }
	    double getMonthlySalary() {
	        return monthlySalary;
	    }
	    double getYearlySalary() {
	        return monthlySalary * 12;
	    }
	    void giveRaise(double percentage) {
	        monthlySalary = monthlySalary + (monthlySalary * percentage / 100);
	    }
	}

