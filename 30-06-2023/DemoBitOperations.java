import java.util.Scanner;
class DemoBitOperations 
{
	public static void main(String[] args) 
	{
		int x=0,y=0,z=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the x: ");
		x=sc.nextInt();
		System.out.println("Enter the y: ");
		y=sc.nextInt();

		z=(x&y);
		System.out.println("ANDing is: "+z);

		z=(x|y);
		System.out.println("ORing is: "+z);
		
		z=(x^y);
		System.out.println("XORing is: "+z);

		z=(x<<2);
		System.out.println("x<<2 is: "+z);

		z=(y>>2);
		System.out.println("y>>2 is: "+z);

		y=-12;
		z=(y>>2);
		System.out.println("y>>2 is: "+z);

		y=-12;
		z=(y>>>2);
		System.out.println("y>>>2 is: "+z);
	}
}
