import java.util.Scanner;
class DemoSwitchInCLoop
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double a,b,ans=0;
		int opt,k=0;
		while(k<3)
		{
			k++;
			System.out.println("\n ***** Menu ****** ");
			System.out.println(" 1.add \n 2.sub \n 3.multi \n 4.div");
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
				default:
					System.out.println("Incorrect Option..!!!");
			}
			System.out.println("Ans is: "+ans);
		}
	}
}
