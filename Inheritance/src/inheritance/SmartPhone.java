/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ishaqhassan
 */
public class SmartPhone extends CellPhone {
    String osVersion = "Q";

    public SmartPhone(String modelName, int year, float screenSize,String osVersion) {
        super(modelName, year, screenSize);
        this.osVersion = osVersion;
    }
    
    public SmartPhone(){
        super("", 212, 2.4f);
    }
    
    void installApp(){
        System.out.println("Installing app from play store");
    }
}
