/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author ishaqhassan
 */
public class Vehicle {
    String modelName,numberPlate;
    int year;
    
    Vehicle(String modelName,String numberPlate,int year){
        this.modelName = modelName;
        this.numberPlate = numberPlate;
        this.year = year;
    }
    
    void drive(){
        System.out.println("Driving Vehicle");
    }
    
    void breaks(){
        System.out.println("Breaking...");
    }
    
    void service(){
        System.out.println("Vehicle is in service center!");
    }
   
    
    /*
    @Override
    public boolean equals(Object obj) {
        return ((Vehicle)obj).modelName.equals(this.modelName); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
}
