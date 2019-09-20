/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.Scanner;
/**
 *
 * @author ishaqhassan
 */
public class Functions {

    static void performAddition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 1st Value : ");
        int v1 = input.nextInt();
        
        System.out.print("Please enter 2nd Value : ");
        int v2 = input.nextInt();
        
        System.out.println("Your answer is : "+(v1+v2));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        performAddition();
        performAddition();
    }
    
    
    
}
