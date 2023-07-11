
import java.util.Scanner;
class CountEvOdArr
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int []ar=new int[7];

		System.out.println("Enter the 7 Nos: ");
		for(int i=0;i<7;i++)
		{
			ar[i]=sc.nextInt();
		}
		int ec=0,oc=0;
		for(int i=0;i<7;i++)
		{
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		
		System.out.print("Elements are: ");
		for(int i=0;i<7;i++)
		{
			System.out.print("  "+ar[i]);
		}
		System.out.print("\n Even Element count: "+ec);
		System.out.print("\n Odd Element count: "+oc);
	}
}

