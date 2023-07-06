import javax.swing.JOptionPane;
class RevNumber
{
	public static void main(String []args)
	{
		int no=Integer.parseInt(JOptionPane.showInputDialog("Enter any number: "));

		System.out.println("The Enterednumber is: "+no);

		int rem, rev=0;
		while(no!=0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println(" The reverse Number is: "+rev);
	}
}