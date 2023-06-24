class InputCmdLn1
{
	public static void main(String []args)
	{
		int x;
		double y;
		
		x=Integer.parseInt(args[0]);			
		y=Double.parseDouble(args[1]);

		System.out.println("x is: "+x);
		System.out.println("y is: "+y);

		System.out.println("x is: "+(x+10));
		System.out.println("y is: "+(y+10));
	}
}