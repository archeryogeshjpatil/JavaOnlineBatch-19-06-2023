
import java.util.Scanner;
class CalcSI
{
	public static void main(String []args)
	{
		int p=0,n=0;
		double r=0.0, si=0.0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the values of p: ");
		p=sc.nextInt();
		
		System.out.println("Enter the values of r: ");
		r=sc.nextDouble();

		System.out.println("Enter the values of n: ");
		n=sc.nextInt();
		
		si=(p*r*n)/100;
		
		System.out.println("Simple Interst is: "+si);
	}
}


