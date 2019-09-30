/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import java.util.ArrayList;

/**
 *
 * @author ishaqhassan
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Alto","ABC 123",2010);
        v.drive();
        v.breaks();
        
        Vehicle v1 = new SportsCar("Audi A6","Xyz 123",2010,300,false);
        v1.drive();
        SportsCar sc = ((SportsCar)v1);
        sc.applyTurbo();
        v1.breaks();
        
        Vehicle v2 = new Bus("Hino","ABC XYZ",2010,100);
        v2.breaks();
        
        ServiceCenter serCen = new ServiceCenter();
        serCen.service(v2);
        
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(v);
        vehicles.add(v1);
        vehicles.add(v2);
        
        System.out.println(vehicles.contains(new Vehicle("Alto","",23)));
        System.out.println(vehicles.indexOf(new Vehicle("Audi A6","",23)));
        
    }
    
}
