
import java.util.Scanner;
class DemoIf
{
	public static void main(String []args)
	{
		double p1,p2,p3,tot,dis=0.0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the price of three items: ");
		p1=sc.nextInt();
		p2=sc.nextInt();
		p3=sc.nextInt();

		tot=p1+p2+p3;
		if(tot>500)
		{
			dis=tot*0.06;
		}
		System.out.println(" Total Bill: "+tot);
		System.out.println(" Discount: "+dis);
		System.out.println(" Pay Rs: "+(tot-dis));
	}
}
