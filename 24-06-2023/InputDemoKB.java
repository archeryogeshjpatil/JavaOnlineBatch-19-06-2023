import java.io.BufferedReader;
import java.io.InputStreamReader;
class InputDemoKB
{	
	public static void main(String []args)
	{
		// allocate the memory to store the data
		int a=0;
		double b=0.0;	
		
		// create the input stream
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		// input the data
		System.out.println("\n Enter the int value: ");
		try{ a=Integer.parseInt(br.readLine()); }catch(Exception e){}

		System.out.println("\n Enter the double value: ");
		try{ b=Double.parseDouble(br.readLine()); }catch(Exception e){}
		
		System.out.println("a="+a+"\t b="+b);
	}
}