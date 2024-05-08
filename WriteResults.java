/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameDevelopment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
/**
 *
 * @author Lina Fernanda Silva Z.
 */
public class WriteResults {
    public static void main(String[] args){
        try{
            //FileWriter results = new FileWriter("C:\\Users\\lunaf\\OneDrive\\Documents\\Game Development\\Trivia Game\\resultsFile.txt");
            //results.write("Writting the results ");
            //results.append("Writting the results ");
            //results.close();
            
            String filePath = "C:\\Users\\lunaf\\OneDrive\\Documents\\Game Development\\Trivia Game\\resultsFile.txt";
            BufferedWriter bwr = new BufferedWriter(writer);
            brw.write("Writting the results");
            bwr.write("\n");
            bwr.close();
            
            System.out.println("I wrote to file");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }  
    }

   
}
