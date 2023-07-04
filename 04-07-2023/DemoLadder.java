import java.util.Scanner;
class DemoLadder
{
	public static void main(String []args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the co-ordinates of point: ");
		x=sc.nextInt();
		y=sc.nextInt();

		if(x>0&&y>0)
		{
			System.out.println(" 1st QD");
		}
		else if(x<0&&y>0)
		{
			System.out.println(" 2nd QD");
		}
		else if(x<0&&y<0)
		{
			System.out.println(" 3rd QD");
		}
		else if(x>0&&y<0)
		{
			System.out.println(" 4th QD");
		}
		else if(x!=0&&y==0)
		{
			System.out.println(" On x axis");
		}
		else if(x==0&&y!=0)
		{
			System.out.println(" On y axis");
		}
		else
		{
			System.out.println(" In org");
		}
	}
}

