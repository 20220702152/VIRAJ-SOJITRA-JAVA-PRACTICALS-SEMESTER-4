package Practical;
import java.util.*;

public class pract6{
    
    
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Distance in Kilometers: ");
        float km = sc.nextFloat();
        float miles = (float)(0.6213711922 * km);
        System.out.println("Distance in miles will be: "+miles);      
    }
    
}