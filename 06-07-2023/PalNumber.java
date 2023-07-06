import javax.swing.JOptionPane;
class PalNumber
{
	public static void main(String []args)
	{
		int no=Integer.parseInt(JOptionPane.showInputDialog("Enter any number: "));

		System.out.println("The Enterednumber is: "+no);

		int tmp,rem, rev=0;
		tmp=no;
		while(no!=0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}

		if(tmp==rev)
		{
			System.out.println(" Number "+rev+" is Palindrome");
		}
		else
		{			
			System.out.println(" Number "+rev+" is not Palindrome");
		}
	}
}