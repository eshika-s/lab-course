package first;

import java.util.Scanner;

public class add1 {
public static void main(String[] args) {
	int a,b;
	Scanner ob=new Scanner(System.in);
	javatest obj=new javatest();
	System.out.println("Enter Two numbers:");
	a=ob.nextInt();
	b=ob.nextInt();
	obj.adder(a,b);
	
	
}
}
