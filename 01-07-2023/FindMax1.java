	// WAP to find the max from two nos

import java.util.Scanner;
class FindMax1
{
	public static void main(String []args)
	{
		int x=0,y=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first Number: ");
		x=sc.nextInt();
		System.out.println("Enter the second Number: ");
		y=sc.nextInt();	

		if(x>y)
		{
			System.out.println("value of x "+x+" is max");
		}
		else
		{
			System.out.println("value of y "+y+" is max");
		}
	}
}
