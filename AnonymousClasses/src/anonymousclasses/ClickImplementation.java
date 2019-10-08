/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author ishaqhassan
 */
public class ClickImplementation implements OnClickListner{
    String email;
    
    void helloWorld(){
        
    };
    
    @Override
    public void onClick() {
        System.out.println("Onclick inside ClickImplementation");
    }
    
}
