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
public class SportsCar extends Vehicle {
    int horsePower;
    boolean turbo;
    
    public SportsCar(String modelName, String numberPlate, int year,int horsePower,boolean turbo) {
        super(modelName, numberPlate, year);
        this.horsePower = horsePower;
        this.turbo = turbo;
    }

    @Override
    void drive() {
        System.out.println("Sports Car driving at high speed!");
    }
    
    void applyTurbo(){
        System.out.println("Applying turbo "+turbo);
    }
    
    @Override
    void service(){
        System.out.println("Sports Car is in service center!");
    }
    
}
