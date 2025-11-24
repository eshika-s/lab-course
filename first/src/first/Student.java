package first;
public class Student {
	    String name;
	    int age;
	    Student() {
	        name = "Saksham";
	        age = 21;
	        System.out.println("Default Constructor Called");
	    }
	    Student(String n, int a) {
	        name = n;
	        age = a;
	        System.out.println("Parameterized Constructor Called");
	    }
	    Student(Student s) {
	        name = s.name;
	        age = s.age;
	        System.out.println("Copy Constructor Called");
	    }
	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	    public static void main(String[] args) {
	        Student s1 = new Student();
	        s1.display();
	        Student s2 = new Student("Eshika", 19);
	        s2.display();
	        Student s3 = new Student(s2);
	        s3.display();
	    }
}


