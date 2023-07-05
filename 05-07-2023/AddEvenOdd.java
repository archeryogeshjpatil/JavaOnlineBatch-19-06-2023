
import java.util.*;
class AddEvenOdd
{
	public static void main(String []args)
	{
		int no,ev=0,od=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 nos: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("No "+(i+1)+": ");
			no=sc.nextInt();
			if(no%2==0)
			{
				ev=ev+no;
			}
			else
			{
				od=od+no;
			}
		}
		System.out.println("Even Sum: "+ev);
		System.out.println("Odd Sum: "+od);
	}
}