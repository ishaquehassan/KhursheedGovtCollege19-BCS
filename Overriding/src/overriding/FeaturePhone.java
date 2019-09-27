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
public class FeaturePhone extends CellPhone{
    
    public FeaturePhone(String modelName) {
        super(modelName);
    }
    
    void brosweInternet(){
        System.out.println("Visiting Google.com on GPRS");
    }
    
}
