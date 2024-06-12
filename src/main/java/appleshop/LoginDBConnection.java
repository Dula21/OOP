/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appleshop;

import javax.swing.JOptionPane;
import java.io.*;
public class LoginDBConnection {
    String myFile="E:\\JavaProjects\\AppleShop\\AccountLogin.txt";
     public void makeConnection(String Record, String file)
             
     {
         try {
             myFile=myFile+file;
          FileWriter writer= new FileWriter(myFile,true);
          BufferedWriter buffer = new BufferedWriter(writer);
          
          buffer.write(Record);
          buffer.newLine();
          buffer.close();
          writer.close();
          
          JOptionPane.showMessageDialog(null,"Sucessfully wrote to the file ");
          
           
          
         }
         catch (IOException e){
             System.out.println("An error occured saving values"+e);
             
         }
             
     }
      public void CreateAccounts(Login obj)
    {
        String LoginString=obj.getUsername()+" "+obj.getPassword()+" ";
        System.out.println(""+LoginString);
        LoginDBConnection con=new LoginDBConnection();
        con.makeConnection(LoginString,"AccountLogin.txt");
    } 
}
