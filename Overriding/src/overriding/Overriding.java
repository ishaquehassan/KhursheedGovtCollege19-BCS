/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ishaqhassan
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CellPhone cell = new CellPhone("3310");
        System.out.println(cell);
        
        CellPhone cell1 = new CellPhone("3310");
        System.out.println(cell.equals(cell1));
        
        //cell.modelName;
        //cell.makeACall("2432535234");
        
        FeaturePhone c130 = new FeaturePhone("c130");
        System.out.println(c130);
        c130.brosweInternet();
        System.out.println("=========");
        SmartPhone s10 = new SmartPhone("Galaxy S10");
        s10.brosweInternet();
    }
    
}
