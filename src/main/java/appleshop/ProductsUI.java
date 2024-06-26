/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appleshop;

/**
 *
 * @author Asus
 */
public class ProductsUI extends javax.swing.JFrame {

    /**
     * Creates new form Products
     */
    public ProductsUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelStockNumber = new javax.swing.JLabel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelProductID = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldProductID = new javax.swing.JTextField();
        jTextFieldProductName = new javax.swing.JTextField();
        jTextFieldStockNumber = new javax.swing.JTextField();
        jTextFieldCategory = new javax.swing.JTextField();
        jTextFieldPrice = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonFind = new javax.swing.JButton();
        jButtonView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apple Shop Istore Products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 110));

        jLabelStockNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelStockNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStockNumber.setText("Stock Number");
        jPanel1.add(jLabelStockNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, 30));

        jLabelProductName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProductName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductName.setText("Product Name");
        jPanel1.add(jLabelProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 40));

        jLabelCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelCategory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCategory.setText("Category");
        jPanel1.add(jLabelCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 40));

        jLabelProductID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProductID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductID.setText("Product ID");
        jPanel1.add(jLabelProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 140, 40));

        jLabelPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrice.setText("Price");
        jPanel1.add(jLabelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 140, 40));

        jTextFieldProductID.setBackground(new java.awt.Color(255, 204, 102));
        jTextFieldProductID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldProductID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProductID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.add(jTextFieldProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 230, 40));

        jTextFieldProductName.setBackground(new java.awt.Color(255, 204, 102));
        jTextFieldProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProductName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.add(jTextFieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 230, 40));

        jTextFieldStockNumber.setBackground(new java.awt.Color(255, 204, 102));
        jTextFieldStockNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldStockNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldStockNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.add(jTextFieldStockNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 230, 40));

        jTextFieldCategory.setBackground(new java.awt.Color(255, 204, 102));
        jTextFieldCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldCategory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCategory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.add(jTextFieldCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 230, 40));

        jTextFieldPrice.setBackground(new java.awt.Color(255, 204, 102));
        jTextFieldPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 102), 1, true));
        jPanel1.add(jTextFieldPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 230, 40));

        jButtonSave.setBackground(new java.awt.Color(255, 204, 102));
        jButtonSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.orange));
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 80, 30));

        jButtonFind.setBackground(new java.awt.Color(255, 204, 102));
        jButtonFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonFind.setText("Find");
        jButtonFind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.orange));
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 90, 30));

        jButtonView.setBackground(new java.awt.Color(255, 204, 102));
        jButtonView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonView.setText("View");
        jButtonView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.yellow, java.awt.Color.yellow, java.awt.Color.orange));
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonView, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        
        Product myobj=new Product();
        myobj.setProductID(jTextFieldProductID.getText().toString());
        myobj.setProductName(jTextFieldProductName.getText().toString());
        myobj.setStockNumber(Integer.valueOf(jTextFieldStockNumber.getText().toString()));
        myobj.setCategory(jTextFieldCategory.getText().toString()); 
        myobj.setPrice(Integer.valueOf(jTextFieldPrice.getText().toString()));
        myobj.addProducts(myobj);
        clear();
        
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
        // TODO add your handling code here:
        ProductDBConnection con=new ProductDBConnection();
      con.findData(jTextFieldProductID.getText().toString());
      con.findData(jTextFieldCategory.getText().toString());
      con.findData(jTextFieldProductName.getText().toString());

    }//GEN-LAST:event_jButtonFindActionPerformed

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonViewActionPerformed
public void clear()
{
    jTextFieldProductID.setText("");
    jTextFieldProductName.setText("");
    jTextFieldStockNumber.setText("");
    jTextFieldCategory.setText("");
    jTextFieldPrice.setText("");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductID;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelStockNumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProductID;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldStockNumber;
    // End of variables declaration//GEN-END:variables
}
