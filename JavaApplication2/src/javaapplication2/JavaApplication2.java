/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author ishaqhassan
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Name : ");
        String name = input.nextLine();
        System.out.print("Please enter your age : ");
        int age = input.nextInt();
        System.out.println("Hi "+name+"! you are "+age+" years old...");
        
    }
    
}
