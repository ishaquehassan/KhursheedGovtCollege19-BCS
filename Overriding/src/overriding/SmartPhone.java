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
public class SmartPhone extends FeaturePhone{
    
    public SmartPhone(String modelName) {
        super(modelName);
    }
    
    
    @Override
    void brosweInternet() {
        super.brosweInternet();
        System.out.println("Browsing Internet Over 4G");
    }
    
    
    
}
