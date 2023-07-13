
// WAP to input and display the 2D array - no of rows and cols decided at runtime.

	// Enter the marks of N students in M subjects.

import java.util.Scanner;
class InputDisplay2DArrayDynamicSize
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int m=0,n=0;

		System.out.println("Enter the student count: ");
		m=sc.nextInt();

		System.out.println("Enter the subject count: ");
		n=sc.nextInt();
		int [][]x=new int[m][n];

		System.out.println("\n Enter the Marks: ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.println("\n Enter the marks of "+(i+1)+" student in "+(j+1)+" subject:");
				x[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n Array elements are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println("\n Student: "+(i+1)+": ");
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}