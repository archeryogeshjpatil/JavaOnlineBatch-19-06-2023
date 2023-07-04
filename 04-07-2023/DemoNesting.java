
import java.io.BufferedReader;
import java.io.InputStreamReader;
class DemoNesting
{
	public static void main(String []args) throws Exception
	{
		int x=0,y=0,z=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any three nos: ");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		z=Integer.parseInt(br.readLine());

		if(x>y)
		{
			if(x>z)
			{
				System.out.println(" x="+x+" is max");
			}
			else
			{
				System.out.println(" z="+z+" is max");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println(" y="+y+" is max");
			}
			else
			{
				System.out.println(" z="+z+" is max");
			}
		}
	}
}
