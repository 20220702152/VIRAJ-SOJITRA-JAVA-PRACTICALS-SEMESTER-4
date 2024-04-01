package Practical;
class Product 
{
    int productID;
    String productName;
    double price;

    Product(int productID, String productName, double price) 
    {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
    }

    void displayInfo() 
    {
        System.out.println("\n");
        System.out.println("Product ID = " + productID);
        System.out.println("Product Name = " + productName);
        System.out.println(String.format("Product Price = %.2f", price));
    }
}

class Electronics extends Product 
{
    String brand;

    Electronics(int productID, String productName, double price, String brand) 
    {
        super(productID, productName, price);
        this.brand = brand;
    }

    @Override
    void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Product Brand = " + brand);
    }
}

class Clothing extends Product 
{
    String size;

    Clothing(int productID, String productName, double price, String size) 
    {
        super(productID, productName, price);
        this.size = size;
    }

    @Override
    void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Product Size = " + size);
    }
}

class Books extends Product 
{
    String author;

    Books(int productID, String productName, double price, String author) 
    {
        super(productID, productName, price);
        this.author = author;
    }

    @Override
    void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Author = " + author);
    }

}

public class pract20_product 
{
    public static void main(String[] args) 
    {
        Clothing Tee = new Clothing(1, "T Shirt", 999, "S");
        Tee.displayInfo();

        Electronics Laptop = new Electronics(2, "Laptop", 77000, "Lenovo");
        Laptop.displayInfo();

        Books b1 = new Books(3, "Psychology of Money", 400, "Morgan Hausal");
        b1.displayInfo();
    }
}