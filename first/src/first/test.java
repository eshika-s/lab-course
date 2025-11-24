package first;

import java.util.Scanner;

class addition
 {
	 public void add(int a, int b)
	 {
		 int c;
		 c=a+b;
		 System.out.println(c);
	 }
 }
 public class test {
	 public static void main(String[] args) {
		addition addition=new addition();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter:");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		addition.add(7, 6);
		
	}
 }  