
class ArrayInputCmd
{
	public static void main(String[]args)
	{
		int []ar=new int[args.length];
		
		for(int i=0;i<args.length;i++)
		{
			ar[i]=Integer.parseInt(args[i]);
		}

		System.out.print("\n Elements are: ");
		
		for(int i=0;i<args.length;i++)
		{
			System.out.print("   "+ar[i]);
		}
	}
}