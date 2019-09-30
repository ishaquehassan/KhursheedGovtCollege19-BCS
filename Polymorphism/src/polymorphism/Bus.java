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
public class Bus extends Vehicle{
    int seats;
    
    public Bus(String modelName, String numberPlate, int year,int seats) {
        super(modelName, numberPlate, year);
        this.seats = seats;
    }

    @Override
    void breaks() {
        System.out.println("Applying hydrolic breaks!");
    }

    
    int howManySeats(){
        return seats;
    }
    
    @Override
    void service(){
        System.out.println("Bus is in service center!");
    }
    
}
