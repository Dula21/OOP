/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appleshop;

/**
 *
 * @author Asus
 */
public class Stocks {

    /**
     * @return the StockNumber
     */
    public int getStockNumber() {
        return StockNumber;
    }

    /**
     * @param StockNumber the StockNumber to set
     */
    public void setStockNumber(int StockNumber) {
        this.StockNumber = StockNumber;
    }

    /**
     * @return the ProductID
     */
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

    /**
     * @param ProductName the ProductName to set
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
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
    private int StockNumber;
    private String ProductID;
    private String ProductName;
    private String Category;
    
    
    public void addProducts(Stocks obj)
    {
        String StocksString= obj.getStockNumber()+" "+obj.getProductID()+" "+obj.getProductName()+" "+obj.getCategory()+" "+obj.getStockNumber()+" " ;
        System.out.println(""+StocksString);
        StockDBConnection con=new StockDBConnection();
        con.makeConnection(StocksString,"E:\\JavaProjects\\AppleShop\\Stock.txt");
    } 

}
