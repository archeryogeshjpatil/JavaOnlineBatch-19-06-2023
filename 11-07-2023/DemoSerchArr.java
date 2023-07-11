
import java.util.Scanner;
class DemoSerchArr
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,no=0;
		int []arr=new int[8];
		
		System.out.println("Enter the 8 elements: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the no to be searched: ");
		no=sc.nextInt();

		int pos=-1;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				pos=i;
				break;
			}
		}
		if(pos!=-1)
			System.out.println("\n Number is present at "+pos+" Position");
		else
			System.out.println("\n No is not present in an array");
	}
}
