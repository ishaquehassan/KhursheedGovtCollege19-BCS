/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

import abstractclasfrses.SoftwareDeveloper;
import abstractclasfrses.Teacher;

/**
 *
 * @author ishaqhassan
 */
public class Student extends Human implements SoftwareDeveloper,Teacher{

    @Override
    public void printAllProgrammingLanguages() {
        System.out.println("Java");
    }

    @Override
    void study() {
        System.out.println("Python");   
    }

    @Override
    public void printSubjects() {
        System.out.println("JAVA");
    }

    
    
}
