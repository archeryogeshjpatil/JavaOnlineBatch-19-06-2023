class DemoDiv
{
	public static void main(String []args)
	{
		int no,cnt=0;
		System.out.print("The list of nos which are div by 3 and 5: ");
		for(no=2;no<=50;no++)
		{
			if(no%3==0&&no%5==0)
			{
				System.out.print("\t"+no);
				cnt++;
			}
		}
		System.out.println("\n Count is: "+cnt);
	}
}