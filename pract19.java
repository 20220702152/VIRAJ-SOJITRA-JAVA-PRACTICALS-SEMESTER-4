package Practical;
import java.lang.Math;

abstract class Shape 
{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    double area() 
    {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() 
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape 
{
    private double length;
    private double width;

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() 
    {
        return length * width;
    }

    @Override
    double perimeter() 
    {
        return 2 * (length + width);
    }
}

class Triangle extends Shape 
{
    private double base;
    private double height;

    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() 
    {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() 
    {
        return 3 * base;
    }
}

public class pract19 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        System.out.println("Circle: Area = " + circle.area() + ", Perimeter = " + circle.perimeter());
        System.out.println("Rectangle: Area = " + rectangle.area() + ", Perimeter = " + rectangle.perimeter());
        System.out.println("Triangle: Area = " + triangle.area() + ", Perimeter = " + triangle.perimeter());
    }
}

