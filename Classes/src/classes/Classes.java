/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

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
        
        System.out.println(h2.name);
        System.out.println(h2.age);
        System.out.println(h2.gpa);
        System.out.println(Human.nationality);
    }
    
}