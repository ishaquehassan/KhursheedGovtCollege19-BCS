/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
/**
 *
 * @author ishaqhassan
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human h1 = new Human("Ishaq",20,3.6f);
        Human h2 = new Human("Ali",10);
        Human.nationality = "Pakistani";
        /* Explicit values for class properties
        h1.name = "Ishaq";
        h1.age = 20;
        h1.gpa = 3.6f;
        */
        System.out.println(Human.nationality);
        Human.nationality = "Arabian";
        System.out.println(h1.name);
        System.out.println(h1.age);
        System.out.println(h1.gpa);
        
        h1.sleep();
        h2.sleep("");
        Human.hello();
        
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.gpa);
        System.out.println(Human.nationality);
        
        // LIST
        ArrayList<Human> myList = new ArrayList<Human>();
        myList.add(h1);
        myList.add(h2);
        
        for(Human h : myList){
            
        }
        
        /*
        Create a program to Add/List students data
        
        Output: 
        Main Menu======
        1. Add Student
        2. List All Students
        
        For e.g. 1:
        Your Name: aksjakjs
        Your age : 13
        Your cellNo : 243535
        exitTomainMenu();
        */
        
    }
    
}