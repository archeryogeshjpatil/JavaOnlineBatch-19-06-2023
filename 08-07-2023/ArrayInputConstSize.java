
import java.util.Scanner;
class ArrayInputConstSize
{
	public static void main(String []args)
	{
		int []ar=new int[5];
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter any 5 nos: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		System.out.print("\n Elements are: ");
		for(int i=0;i<5;i++)
		{
			System.out.print("   "+ar[i]);
		}
	}
}