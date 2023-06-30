
import java.io.*;
class DemoCondiOpt
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int x=0,y=0,z=0,max2=0,max3=0;

		System.out.println("Enter any first numbers: ");
		x=Integer.parseInt(br.readLine());

		System.out.println("Enter any second numbers: ");
		y=Integer.parseInt(br.readLine());

		System.out.println("Enter any third numbers: ");
		z=Integer.parseInt(br.readLine());

		max2 = (x>y) ? x : y ;
		System.out.println("\n Max2 value is: "+max2);

		max3 = (x>y) ? (x>z)?x:z   :  (y>z) ? y:z ;
		System.out.println("\n max3 is: "+max3);
	}
}