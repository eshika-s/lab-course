package first;
import java.util.Scanner;

public class arrange {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int srange, erange;
		System.out.println("Enter start range:");
		srange=scanner.nextInt();
		System.out.println("Enter end range:");
		erange=scanner.nextInt();
		int n=erange-srange;
		int arr[]=new int[n];
		int c=0,a=0;
		for(int i=srange; i<erange; i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c+=1;
				}
			}
			if(c==0)
			{
				arr[a]=i;
				a=a+1;
			}
			c=0;
		}
		System.out.println("Prime numbers:");
		for(int i=0;i<a;i++)
		{
			System.out.println(arr[i]);
		}
		scanner.close();
		
		
	}

}
