import java.util.Scanner;
class DemoSwitchCharOpt
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a,b,ans=0;
		char opt;
		System.out.println("\n ***** Menu ****** ");
		System.out.println(" p.add \n q.sub \n r.multi \n s.div");
		System.out.println("Choose your option: ");
		opt=sc.nextLine().charAt(0);

		System.out.println("Enter any two nos: ");
		a=sc.nextDouble();
		b=sc.nextDouble();

		switch(opt)
		{
			case 'p':
			case 'P':
				ans=a+b;
				break;
			case 'q':
			case 'Q':
				ans=a-b;
				break;
			case 'r':
			case 'R':
				ans=a*b;
				break;
			case 's':
			case 'S':
				ans=a/b;
				break;
			default:
				System.out.println("Incorrect Option..!!!");
		}
		System.out.println("Ans is: "+ans);
	}
}
