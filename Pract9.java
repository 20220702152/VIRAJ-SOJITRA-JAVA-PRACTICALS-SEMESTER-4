package Practical;
import java.util.Scanner;

public class Pract9
{
   public static void main(String[] args) 
   {
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the first floating-point number: ");
       double num1 = input.nextDouble();

       System.out.print("Enter the second floating-point number: ");
       double num2 = input.nextDouble();

       double roundedNum1 = Math.round(num1 * 1000.0) / 1000.0;
       double roundedNum2 = Math.round(num2 * 1000.0) / 1000.0;

       if (roundedNum1 == roundedNum2) 
       {
           System.out.println("The numbers are the same up to three decimal places.");
       }
       else 
       {
           System.out.println("The numbers are different.");
       }
   }
}