/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appleshop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Product {

    String myFile="E:\\AppleShop\\Products\\";
    
    public String getProductID() {
        return ProductID;
    }

    /**
     * @param ProductID the ProductID to set
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }

    
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

   
    public double getPrice() {
        return Price;
    }

   
    public void setPrice(double Price) {
        this.Price = Price;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

   
    public int getStockNumber() {
        return StockNumber;
    }

 
    public void setStockNumber(int StockNumber) {
        this.StockNumber = StockNumber;
    }
     private String ProductID;
     private String ProductName;
     private double Price;
     private String Category;
     private int StockNumber;
     
     public void addProducts(Product obj)
    {
        String productsString=obj.getProductID()+" "+obj.getProductName()+" "+obj.getCategory()+" "+String.valueOf(obj.getStockNumber())+" " +String .valueOf(obj.getPrice());
        System.out.println(""+productsString);
        ProductDBConnection con=new ProductDBConnection();
        con.makeConnection(productsString,"E:\\AppleShop\\Products.txt");
    } 
    public void viewProductFromFile(String filePath, String productID)
     {

         {
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3 && data[0].equals(ProductID)) {
                    
                    String ProductName = data[0];
                    double Price = Integer.parseInt(data[1]);
                    String Category = data[2];
                    int StockNumber =Integer.parseInt(data[3]);
                    
                    System.out.println("Product ID: " + ProductID);
                    System.out.println("Product Name: " + ProductName);
                    System.out.println("Product Category: " + Category);
                    System.out.println("Stock Number: " + StockNumber);
                    System.out.println("Price: $" + Price);
                    return; // Exit the method after displaying the product details
                }
            }
            System.out.println("Product not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        
     }
     } 
     
     
     
     
}
