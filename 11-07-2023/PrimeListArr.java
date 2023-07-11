
import java.util.Scanner;
class PrimeListArr
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the element count: ");
		int cnt=sc.nextInt();

		int []ar=new int[cnt];

		System.out.println("Enter the "+cnt+" Nos: ");
		for(int i=0;i<cnt;i++)
		{
			ar[i]=sc.nextInt();
		}
		int no, d, flg=0, pc=0;
		System.out.println("\n Prime nos: ");
		for(int i=0;i<7;i++)
		{
			no=ar[i];
			d=2;
			flg=0;
			while(d<=(no/2))
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			if(flg==0)
			{
				pc++;
				System.out.println("  "+no);
			}
		}
		System.out.print("\n Prime count: "+pc);
		System.out.print("Elements are: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print("  "+ar[i]);
		}
	}
}
