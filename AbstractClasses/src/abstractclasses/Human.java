/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author ishaqhassan
 */
public abstract class Human {
    String name;
    String email;
    int age;
    
    void printName(){
        System.out.println("Hello "+name);
    }
    
    abstract void study();
}
