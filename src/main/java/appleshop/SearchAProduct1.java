/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appleshop;

import java.awt.Desktop;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchAProduct1 extends javax.swing.JFrame {

    String myFile="E:\\JavaProjects\\AppleShop\\Products.txt";
   
     public SearchAProduct1() {
       initComponents();
    }

   private String searchInFile(String myFile, String searchCategory, String searchProductName, double searchPrice) {
    StringBuilder matchingContent = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] rowData = line.split(",");
            if (rowData.length >= 4) {
                String productName = rowData[1];
                double price;
                try {
                    price = Double.parseDouble(rowData[2]);
                } catch (NumberFormatException e) {
                    // Handle the error, such as skipping this line or displaying an error message
                    e.printStackTrace();
                    continue; // Skip to the next line
                }
                String category = rowData[3];

                if (category.equalsIgnoreCase(searchCategory) && productName.equalsIgnoreCase(searchProductName) && price == searchPrice) {
                    matchingContent.append(line).append("\n");
                }
            } else {
                System.out.println("Invalid data format: " + line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return matchingContent.toString();
}



       public class ProductSearch {
    // Method to search for a product by its category
    public List<Product> searchByCategory(List<Product> Products, String Category) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : Products) {
            if (product.getCategory().equalsIgnoreCase(Category)) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
    }

    // Method to search for a product by its name
    public List<Product> searchByName(List<Product> Products,String ProductName) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : Products) {
            if (product.getProductName().equalsIgnoreCase(ProductName)) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
    }

    // Method to search for a product by its price range
    public List<Product> searchByPriceRange(List<Product> Products, double minPrice, double maxPrice) {
        List<Product> matchingProducts = new ArrayList<>();

        for (Product product : Products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                matchingProducts.add(product);
            }
        }

        return matchingProducts;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jTextFieldProductName = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonBacktoMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Istore Products");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 37, 370, 49));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Category");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 111, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Price");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 111, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Product Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 111, 35));

        jTextFieldCategory.setBackground(new java.awt.Color(255, 204, 0));
        jTextFieldCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldCategory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jTextFieldCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoryActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 183, 38));

        jTextFieldPrice.setBackground(new java.awt.Color(255, 204, 0));
        jTextFieldPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel3.add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 183, 40));

        jTextFieldProductName.setBackground(new java.awt.Color(255, 204, 0));
        jTextFieldProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProductName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel3.add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 165, 183, 40));

        jButtonSearch.setBackground(new java.awt.Color(255, 204, 51));
        jButtonSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.orange));
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 502, 115, -1));

        jButtonBacktoMenu.setBackground(new java.awt.Color(255, 204, 0));
        jButtonBacktoMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBacktoMenu.setText("Back To Menu");
        jButtonBacktoMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jButtonBacktoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBacktoMenuActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBacktoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 502, 119, 29));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 343, 328, 141));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        ProductDBConnection con=new ProductDBConnection();
                                                  
   
  String category = jTextFieldCategory.getText();
    String productName = jTextFieldProductName.getText();
    double price = 0.0;
    
// Debug statement to check the value of jTextFieldPrice
    System.out.println("Price text: " + jTextFieldPrice.getText());

    try {
        price = Double.parseDouble(jTextFieldPrice.getText());
    } catch (NumberFormatException e) {
        // Display an error message
        JOptionPane.showMessageDialog(this, "Invalid price format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
        return; // Stop further processing
    }

    // Perform the search based on the provided criteria
    String matchingContent = searchInFile(myFile, category, productName, price);

    // Display the matching content in the text area or any other component
    jTextArea1.setText(matchingContent);

    // Open the source file using the default system application
    try {
        Desktop.getDesktop().open(new File(myFile));
    } catch (IOException e) {
        // Display an error message if the file cannot be opened
        JOptionPane.showMessageDialog(this, "Failed to open the file.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }






    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonBacktoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBacktoMenuActionPerformed
        // TODO add your handling code here:
        MenuBar1 db = new  MenuBar1();
        db.setVisible(true);
        db.pack();
        db.setLocationRelativeTo(null);
        db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBacktoMenuActionPerformed

    private void jTextFieldCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            SearchAProduct1 frame = new SearchAProduct1();
            frame.setVisible(true);
        });
    }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBacktoMenu;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables
}
