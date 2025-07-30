package first;
import java.util.Scanner;

public class sumthirty {
	
	 
	public static void main(String[] args) {
	n obj=new n();
	System.out.println(obj.check());
	}
	}
	class n{
	Scanner input=new Scanner(System.in);
	public int check() {
	int sum=0,a,b;
	System.out.println("enter first number");
	a=input.nextInt();
	System.out.println("enter second number");
	b=input.nextInt();
	sum=a+b;
	if(sum>=30) {
	return 1;
	}
	else {
	return check();
	}
	}
	


}
