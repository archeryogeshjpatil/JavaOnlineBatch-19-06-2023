import java.util.Scanner;
class DemoSwitchInILoop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a,b,ans=0;
		int opt;
		while(true)
		{
			System.out.println("\n ***** Menu ****** ");
			System.out.println(" 1.add \n 2.sub \n 3.multi \n 4.div \n 5.stop");
			System.out.println("Choose your option: ");
			opt=sc.nextInt();

			System.out.println("Enter any two nos: ");
			a=sc.nextDouble();
			b=sc.nextDouble();

			switch(opt)
			{
				case 1:
					ans=a+b;
					break;
				case 2:
					ans=a-b;
					break;
				case 3:
					ans=a*b;
					break;
				case 4:
					ans=a/b;
					break;
				case 5:
					System.exit(0);
			}
			System.out.println("Ans is: "+ans);
		}
	}
}
