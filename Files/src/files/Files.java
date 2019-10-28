/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Ishaq
 */
public class Files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "hello.txt";
        writeFile(fileName);
       readFile(fileName);
        
    }
    
    public static void readFile(String filName){
        try{
            FileReader reader = new FileReader(filName);   
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while(line != null){
                System.out.println(line);
                line = buffer.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String filName){
        File f = new File(filName);
        try{
           FileWriter writer = new FileWriter(f,true);
            System.out.println("Enter your data");
           while(true){
               Scanner scan = new Scanner(System.in);
               String inp = scan.nextLine();
               if(inp.equals("q")){
                   break;
               }
               writer.write("\n"+inp);
               
           }
           writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
