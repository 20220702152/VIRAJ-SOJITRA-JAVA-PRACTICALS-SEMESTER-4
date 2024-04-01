package Practical;
import java.util.Scanner;

public class Pract10
{
   public static void main(String[] args) 
   {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a single character: ");
       String input = scanner.next();

       if (input.length() == 1) 
       {
           char ch = input.charAt(0);

           if (isVowel(ch)) 
           {
               System.out.println(ch + " is a vowel.");
           } 
           else if (isLetter(ch)) 
           {
               System.out.println(ch + " is a consonant.");
           }
           else 
           {
               System.out.println(ch + " is not a letter.");
           }
       } 
       else 
       {
           System.out.println("Invalid input. Please enter a single character.");
       }
   }

   public static boolean isVowel(char ch) 
   {
       ch = Character.toLowerCase(ch); 
       return "aeiou".indexOf(ch) != -1;
   }

   public static boolean isLetter(char ch) 
   {
       return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
   }
}
