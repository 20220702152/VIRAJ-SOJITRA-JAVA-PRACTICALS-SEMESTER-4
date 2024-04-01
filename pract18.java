package Practical;
import java.util.*;

class Person
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	
	@Override
	public String toString()
	{
		return("Person name: "+name+", Age: "+age);
	}
}
class Employee extends Person
{
	private int employeeid;
	private double salary;
	public Employee(String name, int age, int employeeid, double salary)
	{
		super(name,age);
		this.employeeid=employeeid;
		this.salary=salary;
	}
	public int getem0ployeeid()
	{
		return employeeid;
	}
	public double getsalary()
	{
		return salary;
	}
	@Override
	public String toString()
	{ 
		return"Employee;" + super.toString()+ ", Employee id: " +employeeid + ", Salary :" +salary;
	}
	
}
public class pract18
{
	public static void main(String[] args)
	{
		Person person1 = new Person("Viraj", 21);
        Employee employee1 = new Employee("Jay", 25, 1234, 50000);

        System.out.println("Employee name accessed from derived class: " + employee1.getname());
        System.out.println("Employee age accessed from derived class: " + employee1.getage());

        System.out.println("Person object: " + person1);
        System.out.println("Employee object: " + employee1);
	}
}