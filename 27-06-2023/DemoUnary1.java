
import java.io.BufferedReader;
import java.io.InputStreamReader;
class DemoUnary1
{
	public static void main(String []args) throws Exception
	{
		int x=0,y=0;
		double z=0.0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\n Enter the values of x and y: ");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());

		z=x/y;	// as int/int the fraction part will be eliminated
		System.out.println("\n ans is: "+z);

		z=(double)x/y;	
		System.out.println("\n ans is: "+z);	

		z=x/(double)y;	
		System.out.println("\n ans is: "+z);	

		z=(double)x/(double)y;	
		System.out.println("\n ans is: "+z);	
	}
}