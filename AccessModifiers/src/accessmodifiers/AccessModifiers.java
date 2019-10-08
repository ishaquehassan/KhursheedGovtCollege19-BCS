/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accessmodifiers;

/**
 *
 * @author ishaqhassan
 */
public class AccessModifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student();
        // https://www.javatpoint.com/access-modifiers
        // Not accessible since its private
        //st1.name = "";
        st1.age = 1;
    }
    
}
