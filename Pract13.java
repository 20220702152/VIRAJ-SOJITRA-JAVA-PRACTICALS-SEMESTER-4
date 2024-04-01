package Practical;
import java.util.Scanner;

public class Pract13

{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Multiplication table of " + num + ":");

        for (int i = 1; i <= 12; i++) 
        {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
