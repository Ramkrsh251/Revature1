package day5;

import java.util.Scanner;

public class Area  {

	static double areaOfQuadilateral(double l, double b)
	{
		return l*b;
	}
	static double areaOfQuadilateral(double s)
	{
		return s*s;
	}
	static double areaOfQuadilateral(double a,double b,double h )
	{
		return(a+b)* h/2;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.equalsIgnoreCase("R"))
		{
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(areaOfQuadilateral(l,b));
		}
		if(s.equalsIgnoreCase("S"))
		{
			double l=sc.nextDouble();
			System.out.println(areaOfQuadilateral(l));
		}
		if(s.equalsIgnoreCase("T"))
		{
			double l=sc.nextDouble();
			double b=sc.nextDouble();
			double h=sc.nextDouble();
			System.out.println(areaOfQuadilateral(l,b,h));
		}
	}
}