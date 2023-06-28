
import java.util.Scanner;
class DemoArith
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a,b;
		double ans;

		System.out.println("Enter the values of a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();

		ans=a+b;
		System.out.println("Addition is: "+ans);

		ans=a-b;
		System.out.println("sub is: "+ans);		

		System.out.println("multi is: "+(a*b));

		System.out.println("div is: "+(a/b));

		ans=(double)a/b;
		System.out.println("div is: "+ans);

		System.out.println("mod is: "+(a%b));
	
	}
}