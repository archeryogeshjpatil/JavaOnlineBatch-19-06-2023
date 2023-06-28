class DemoLogical 
{
	public static void main(String[] args) 
	{
		int x=10, y=12;
		boolean ans;

		ans=(x>y)&&(y<100);		
		System.out.println("(x>y)&&(y<100) is: "+ans);

		ans=(x<y)&&(y<100);		
		System.out.println("(x<y)&&(y<100) is: "+ans);

		ans=(x>y)||(y<100);		
		System.out.println("(x>y)||(y<100) is: "+ans);

		ans=(x>y)||(y==100);		
		System.out.println("(x>y)||(y==100) is: "+ans);

		ans=!(x>y);		
		System.out.println("!(x>y) is: "+ans);

		ans=!(x<y);		
		System.out.println("!(x>y) is: "+ans);
		
	}
}
