package Practical;

import java.util.Scanner;

public class pract2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first input value:");
        int a=sc.nextInt();
        System.out.println("Enter second input value:");
        int b=sc.nextInt();
        
        int c=a+b;
        
        System.out.println("sum:"+c);
        
        int d=a-b;
        System.out.println("substraction:"+d);
        
        int e=a*b;
        System.out.println("Multiplication::"+e);
        
        int f=a/b;
        System.out.println("division:"+f);
    }
}