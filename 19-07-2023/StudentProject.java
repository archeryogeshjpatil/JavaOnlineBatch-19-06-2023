
import java.util.Scanner;
class Student
{
	private int id;
	private double per;
    
	public void in()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the student ID: ");
		id=sc.nextInt();
		System.out.println("Enter the Percentage: ");
		per=sc.nextDouble();
	}
	public void out()
	{
		System.out.println("\n student ID: "+id+"\t Percentage: "+per);
	}
}

class StudentProject
{
	public static void main(String []args)
	{
		Student sob=new Student();
		sob.in();
		sob.out();
	}
}