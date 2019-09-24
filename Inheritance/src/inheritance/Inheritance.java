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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*CellPhone cell = new CellPhone();
        cell.modelName = "3310";
        cell.screenSize = 1.5f;
        cell.year = 2000;
        cell.poweOn();
        cell.makeACall("1234232424");
        cell.sendSms("2423523423","hello world");*/
        
        //CellPhone cl = new CellPhone();
        // cl.installApp(); ERROR
        
        SmartPhone cell = new SmartPhone("3310",2000,1.5f);
        cell.installApp();
        cell.poweOn();
        cell.makeACall("1234232424");
        cell.sendSms("2423523423","hello world");
    }
    
}
