package Practical;
import java.util.*;

public class pract7{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius : ");
        float c = sc.nextFloat();
        float f = c * (9.0f/5.0f) + 32;
        System.out.println("The temperature is "+f+" degree Fahrenheit.");
    }
    
}