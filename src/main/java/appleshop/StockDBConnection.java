/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appleshop;

import javax.swing.JOptionPane;
import java.io.*;

public class StockDBConnection {
    String myFile="E:\\JavaProjects\\AppleShop\\Stock.txt";
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
     public void findData(String value){
         try {
             boolean found=true;
             String[] words=null;
             
             FileReader fileR= new FileReader(myFile);
             BufferedReader br= new BufferedReader(fileR);
             
             String FindLine;
             String input=value;
             
             outerLoop:
             while ((FindLine=br.readLine())!=null){
                 
                 words=FindLine.split("");
                 for (String word:words){
                     
                     if (word.equals(input)){
                         found=true;
                         System.out.println(FindLine);
                         
                         break outerLoop;
                     }
                     else{
                         found=false;
                     }
                     }
                 }
             if (found){
                 JOptionPane.showMessageDialog(null,"Value in the list.");
             }
             else {
                 JOptionPane.showMessageDialog(null,"Value not in the list");
             }
             fileR.close();
             br.close();
             }
         catch (Exception e){
             System.out.println("An error occured searching"+e);
         }
     }
    
}
