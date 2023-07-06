
import java.util.Scanner;
class MaxDigit
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int no=sc.nextInt();

		int rem, md=0;
		do
		{
			rem=no%10;
			if(rem>md)
			{
				md=rem;
			}
			no=no/10;
		}while(no!=0);

		System.out.println("Max digit is "+md);
	}
}
