class LblBreakContinue
{
	public static void main(String[] args) 
	{
		int i,j;
		outer:for(i=0;i<10;i++)
		{
			System.out.println("");
			for(j=0;j<10;j++)
			{
				if(i==5)
				{
					break outer;
				}
				System.out.print("-");
				if(j>i)
				{
					continue outer;
				}
				System.out.print("*");
			}
		}
	}
}

