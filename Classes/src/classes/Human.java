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
public class Human {
    String name;
    int age;
    float gpa;
    static String nationality;
    
    // No argument Constructor
    
    /*
    Human(String name,int age,Date dob){
        this.name = name;
        this.age = age;
    }
    */
    
    Human(String name,int age){
        this.name = name;
        this.age = age;
        //this.gpa = 2.3f;
    }
    
    Human(String name,int age,float gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    /*
    Human(String n,int a,float g){
        name = n;
        age = a;
        gpa = g;
    }
    */
    
   
    
    void sleep(){
        System.out.println(name+" is sleeping!");
    }
    
    void sleep(String message){
        System.out.println(message);
    }
    
    static void hello(){
        System.out.println(nationality+"Hello world from human");
    }
}
