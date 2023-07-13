
	// WAP to input and display the 2D array

import java.util.Scanner;
class InputDisplay2DArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]x=new int[3][3];

		System.out.println("\n Enter the array of 3x3: ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextInt();
			}
		}

		System.out.println("\n Array elements are: ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}