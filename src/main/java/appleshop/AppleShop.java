/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package appleshop;

import javax.swing.SwingUtilities;

/**
 *
 * @author Asus
 */
public class AppleShop {

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> {
             LoginUI loginWindow = new LoginUI();
             loginWindow.setVisible(true);
            
           
            // Other code
        });
    }
}

    

