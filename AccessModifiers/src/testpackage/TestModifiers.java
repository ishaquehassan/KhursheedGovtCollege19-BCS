/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpackage;

import accessmodifiers.Student;

/**
 *
 * @author ishaqhassan
 */
public class TestModifiers extends Student{
   public static void main(String[] args) {
        TestModifiers st1 = new TestModifiers();
        Student st2 = new Student();
        // Not accessible since its default and outside the package
        //st1.email = "";
        st1.age = 1;
        //Not accessible since its protected and outside the package without inherit
        //st2.age = 2;
    }
    
}
