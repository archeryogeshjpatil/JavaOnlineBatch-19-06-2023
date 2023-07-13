import java.util.Scanner;
class SortArray
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element count: ");
		int cnt=sc.nextInt();

		int []arr=new int[cnt];
		System.out.println("Enter the "+cnt+" elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.print("\n Before Sort: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}

		// Sorting
		int tmp;
		for(int i=0;i<(arr.length-1);i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}

		System.out.print("\n After Sort: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
}
