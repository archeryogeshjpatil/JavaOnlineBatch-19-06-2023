import java.util.Scanner;
import java.util.Arrays;
class DemoArraysClassMethods
{
	public static void display(int []a)
	{		
		System.out.println("\n Array elements before sort: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("  "+a[i]);
		}

	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []x=new int[7];

		System.out.println("\n Enter the 7 elems: ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("\n Enter the number to be searched: ");
		int no=sc.nextInt();

		display(x);
		Arrays.sort(x);
		display(x);

		int pos=-1;
		pos=Arrays.binarySearch(x,no);
		if(pos>=0)
			System.out.println("\n Nos is present at "+pos+" Position");
		else
			System.out.println("\n Nos is absent");
		
	}
}