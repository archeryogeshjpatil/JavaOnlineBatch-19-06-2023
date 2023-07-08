
import java.util.Scanner;
class ArrayInputSizeRt
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the element count: ");
		int cnt=sc.nextInt();

		int []ar=new int[cnt];
	
		System.out.println("Enter any "+ cnt +" nos: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}

		System.out.print("\n Elements are: ");
		for(int i=0;i<cnt;i++)
		{
			System.out.print("   "+ar[i]);
		}
	}
}
