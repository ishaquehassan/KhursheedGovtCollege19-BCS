/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morediveintofunctions;

import java.util.Scanner;
/**
 *
 * @author ishaqhassan
 */
public class MoreDiveIntoFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("=========CALCULATOR==========");
        boolean isFirstLoop = true;
        int a = 0;
        int b = 0;
                
        outerLoop:
        while(true){
            System.out.println("Press 1 for Addition!");
            System.out.println("Press 2 for Subtraction!");
            System.out.println("Press 3 for Multiplication!");
            System.out.println("Press 4 for Division!"); 
            System.out.println("Press 5 for EXIT!"); 
            
            int option = input.nextInt();
            
            if(option != 5){
                if(isFirstLoop){
                    System.out.print("Enter your first value : ");
                    a = input.nextInt();   
                    isFirstLoop = false;
                }
                System.out.print("Enter your second value : ");
                b = input.nextInt();   
            }
            
            switch(option){
                case 1:
                    a = add(a,b);
                    break;
                case 2:
                    a = subtract(a,b);
                    break;
                case 3:
                    a = multiply(a,b);
                    break;
                case 4:
                    a = divide(a,b);
                    break;
                case 5:
                    break outerLoop;
                default:
                    System.out.println("Invalid Option!");
                    
            }
        }
    }
    
    static int add(int a,int b){
        int c = a+b;
        System.out.println("Answer is "+c);
        return c;
    }
    
    static int subtract(int a,int b){
        int c = a-b;
        System.out.println("Answer is "+c);
        return c;
    }
    
    static int multiply(int a,int b){
        int c = a*b;
        System.out.println("Answer is "+c);
        return c;
    }
    
    static int divide(int a,int b){
        int c = a/b;
        System.out.println("Answer is "+c);
        return c;
    }
    
}
