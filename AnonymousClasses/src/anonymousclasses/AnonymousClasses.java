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
public class AnonymousClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OnClickListner myObj = new OnClickListner(){
            String name;
            public void hello(){
                
            }
            
            @Override
            public void onClick(){
                hello();
                System.out.println("hello world");
            }
        };
        
        myObj.onClick();
        
        ClickImplementation clm = new ClickImplementation();
        
        OnClickListner clm1 = new ClickImplementation();
        clm.onClick();
        //clm.email;
        clm.helloWorld();
    }
    
}
