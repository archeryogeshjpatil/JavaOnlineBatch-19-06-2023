
	// Enter the marks 4 students in N subjects (Note that, N may be different
	// for every student and it represents no of subjects)

import java.util.Scanner;
class DemoJaggedArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int [][]x=new int[4][];
		
		System.out.println("Enter the Details of 4 students: ");
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the subject count of "+(i+1)+" student: ");
			int cnt=sc.nextInt();
			x[i]=new int[cnt];
			System.out.println("Enter the marks in "+cnt+" subjects: ");
			for(int j=0;j<cnt;j++)
			{
				System.out.println("Subject "+(j+1)+": ");
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("\n Student Details ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("\n Student: "+(i+1)+": ");
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}
