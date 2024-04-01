package Practical;

import java.util.*;

public class pract4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input value:");
		int a=sc.nextInt();
		System.out.println("Enter second input value:");
		int b=sc.nextInt();
		System.out.println("Enter third input value:");
		int c=sc.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("the lowest number="+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("The lowest number="+b);
		}
		else
		{
			System.out.println("the lowest number="+c);
		}
	}
}