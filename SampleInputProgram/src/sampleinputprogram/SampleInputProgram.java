/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleinputprogram;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ishaqhassan
 */
public class SampleInputProgram {
    
    static ArrayList<Student> students;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        students = new ArrayList<Student>();
        mainMenu();
    }
    
    static void mainMenu(){
        while(true){
            Scanner inp = new Scanner(System.in);
            System.out.println("Main menu=====");
            System.out.println("Press 1 to add student");
            System.out.println("Press 0 to EXIT");
            int val = inp.nextInt();
            if(val == 1){
                addStudent();
            }
            if(val == 0){
                break;
            }
        }
    }
    
    static void addStudent(){
       System.out.println("Enter your name");
       Scanner inp = new Scanner(System.in);
       String name = inp.nextLine();
       Student s = new Student(name);
       students.add(s);
    }
    
}
