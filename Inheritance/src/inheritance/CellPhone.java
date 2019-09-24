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
public class CellPhone {
    String modelName;
    int year;
    float screenSize;
    
    CellPhone(String modelName,int year,float screenSize){
        this.modelName = modelName;
        this.year = year;
        this.screenSize = screenSize;
    }
    
    void poweOn(){
        System.out.println("Cell Phone is powering ON");
    }
    
    void makeACall(String number){
        System.out.println("Calling "+number);
    }
    
    void sendSms(String number,String message){
        System.out.println("Sending "+message+" to "+number);
    }
    
}
