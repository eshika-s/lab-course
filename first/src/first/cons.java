package first;

public class cons {
	int[] arr;
	public cons(int[] a)
	{
		arr=a;
		System.out.println("Constructor Called");
	}
	public void display()
	{
		System.out.println("Array elements:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	
}
