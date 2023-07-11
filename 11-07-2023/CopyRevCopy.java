import java.util.Scanner;
class CopyRevCopy
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []ar=new int[6];

		System.out.println("Enter the 6 Nos: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		// copy
		int []x=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			x[i]=ar[i];
		}
		/*
			ar 0    1   2    3     4    5
			 [23] [56] [89] [12] [82] [33]

			 y 0    1    2    3    4    5
			  [33] [82] [12] [89] [56] [23] 
		
		*/
			
		// Reverse copy
		int []y=new int[ar.length];
		for(int i=0;i<ar.length;i++)
		{
			y[i]=ar[5-i];
		}

		
		System.out.print("\n Original array Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}

		System.out.print("\n Simple Copy: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.print("\n Reverse Copy: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+y[i]);
		}
	}
}

