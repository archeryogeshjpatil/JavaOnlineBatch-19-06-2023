import javax.swing.JOptionPane;
class DemoPrime
{
	public static void main(String []args)
	{
		int no,d,flg=0;
		no=Integer.parseInt(JOptionPane.showInputDialog("Enter the Number: "));
		System.out.println("\n Entered Number: "+no);

		d=2;
		while( d<=(no/2) )
		{
			if(no%d==0)
			{
				flg=1;
				break;
			}
			d++;
		}
		if(flg==0)
			System.out.println("No is Prime");
		else
			System.out.println("No is not Prime");
	}
}
