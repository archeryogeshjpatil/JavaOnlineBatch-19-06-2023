/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
class InputBRISR
{
	public static void main(String []args)
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try
		{ 
			System.out.print("Enter the int value: ");
			x=Integer.parseInt(br.readLine());
			System.out.print("Enter the double value: ");
		 	y=Double.parseDouble(br.readLine()); 

		}
		catch(Exception e)
		{
		}
	
		System.out.print("x: "+x+"\t y: "+y);
	}
}
*/
//-----------------------------------------------------------------------------------------------

import java.io.*;
class InputBRISR
{
	public static void main(String []args) throws Exception
	{
		int x=0;
		double y=0.0;

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		System.out.print("Enter the int value: ");
		x=Integer.parseInt(br.readLine());
		System.out.print("Enter the double value: ");
		y=Double.parseDouble(br.readLine()); 
		System.out.print("x: "+x+"\t y: "+y);
	}
}