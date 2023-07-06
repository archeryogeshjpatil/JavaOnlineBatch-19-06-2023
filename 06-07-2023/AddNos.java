import java.util.Scanner;
class AddNos 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int no,sum=0;
		char ch;
		do
		{			
			System.out.println("Enter Number: ");
			no=sc.nextInt();
			sum=sum+no;
			
			System.out.println("Press y to continue and n to stop: ");
			sc.nextLine();
			ch=sc.nextLine().charAt(0); // "hello" ---> 'h' and    "y" ---> 'y'
			if(ch!='y')
			{
				break;
			}
		}while(true);
		System.out.println("Sum of all entered nos: "+sum);
	}
}
