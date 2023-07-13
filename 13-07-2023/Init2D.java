
class Init2D
{
	public static void main(String []args)
	{
		int [][]x={ {12,23,34,45},{11,22,33,44},{67,34,19,68} };

		System.out.println("\n Array elements are: ");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}