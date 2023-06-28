import java.io.BufferedReader;
import java.io.InputStreamReader;
class DemoUnary
{
	public static void main(String []args) throws Exception
	{
		int x=0,y=0,z=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n Enter the values of x and y: ");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());

		z=-x;
		System.out.println("\n values of x="+x+"\t y="+y+"\t z="+z);

		++x;
		y--;
		System.out.println("\n values of x="+x+"\t y="+y+"\t z="+z);

		z=++x+y--;
		System.out.println("\n values of x="+x+"\t y="+y+"\t z="+z);
	}
}