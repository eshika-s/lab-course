package first;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
			
		}
		System.out.println("Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		scanner.close();
	}
	

}
