import java.util.Scanner;
class GenMax 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any number: ");
		int no=sc.nextInt();

		int d,nn=0,rem,tmp;
		tmp=no;
		d=9;
		do
		{
			no=tmp;
			while(no!=0)
			{
				rem=no%10;
				if(rem==d)
				{
					nn=(nn*10)+rem;
				}
				no=no/10;
			}
		}while(--d>=0);

		System.out.println("Possible max: "+nn);
	}
}
