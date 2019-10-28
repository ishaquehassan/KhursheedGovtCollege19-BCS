/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewithobjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ishaq
 */
public class FileWithObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        readFile("Students.txt");
        return;
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter your Name");
         String name = scan.nextLine();
         System.out.println("Enter your Email");
         String email = scan.nextLine();
         System.out.println("Enter your Age");
         String age = scan.nextLine();
         
         Student st = new Student(name,email,Integer.parseInt(age));
         writeFile("Students.txt", st);
    }
    
    
    public static void readFile(String filName){
        try{
            FileReader reader = new FileReader(filName);   
            BufferedReader buffer = new BufferedReader(reader);
            String line = buffer.readLine();
            while(line != null){
                System.out.println(line);
                String[] splittedData = line.split(",");
                String[] rawName = splittedData[0].split("=");
                String[] rawEmail = splittedData[1].split("=");
                String[] rawAge = splittedData[2].split("=");
                Student st = new Student(rawName[1],rawEmail[1],Integer.parseInt(rawAge[1]));
                System.out.println("Name = "+st.getName());
                System.out.println("Email = "+st.getEmail());
                System.out.println("Age = "+st.getAge());
                line = buffer.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public static void writeFile(String filName,Object myObj){
        File f = new File(filName);
        try{
           FileWriter writer = new FileWriter(f,true);
           writer.write(myObj.toString()+"\n");
           writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
