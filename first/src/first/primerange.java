package first;

import java.util.Scanner;

public class primerange {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int srange, erange;
	System.out.println("Enter start range:");
	srange=scanner.nextInt();
	System.out.println("Enter end range ");
	erange=scanner.nextInt();
	int c=0;
	for(int i=srange; i<erange; i++)
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				c+=1;
		}
		if(c==0)
			System.out.println(i);
		c=0;
	}
	scanner.close();
	
}
}
