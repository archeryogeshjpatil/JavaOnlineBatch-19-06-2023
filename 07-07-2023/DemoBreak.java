
import java.util.Scanner;
class DemoBreak
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int no,add=0;
		while(true)
		{
			System.out.println("Enter any number: ");
			no=sc.nextInt();
			if(no<0)
			{
				break;
			}
			add=add+no;
		}
		System.out.println("ans is "+add);
	}
}
